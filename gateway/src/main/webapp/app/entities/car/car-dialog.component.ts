import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Car } from './car.model';
import { CarPopupService } from './car-popup.service';
import { CarService } from './car.service';

@Component({
    selector: 'jhi-car-dialog',
    templateUrl: './car-dialog.component.html'
})
export class CarDialogComponent implements OnInit {

    car: Car;
    isSaving: boolean;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private carService: CarService,
        private eventManager: JhiEventManager
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    save() {
        this.isSaving = true;
        if (this.car.id !== undefined) {
            this.subscribeToSaveResponse(
                this.carService.update(this.car));
        } else {
            this.subscribeToSaveResponse(
                this.carService.create(this.car));
        }
    }

    private subscribeToSaveResponse(result: Observable<Car>) {
        result.subscribe((res: Car) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError());
    }

    private onSaveSuccess(result: Car) {
        this.eventManager.broadcast({ name: 'carListModification', content: 'OK'});
        this.isSaving = false;
        this.activeModal.dismiss(result);
    }

    private onSaveError() {
        this.isSaving = false;
    }

    private onError(error: any) {
        this.alertService.error(error.message, null, null);
    }
}

@Component({
    selector: 'jhi-car-popup',
    template: ''
})
export class CarPopupComponent implements OnInit, OnDestroy {

    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private carPopupService: CarPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.carPopupService
                    .open(CarDialogComponent as Component, params['id']);
            } else {
                this.carPopupService
                    .open(CarDialogComponent as Component);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
