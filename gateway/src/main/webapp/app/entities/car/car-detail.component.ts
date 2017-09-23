import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager } from 'ng-jhipster';

import { Car } from './car.model';
import { CarService } from './car.service';

@Component({
    selector: 'jhi-car-detail',
    templateUrl: './car-detail.component.html'
})
export class CarDetailComponent implements OnInit, OnDestroy {

    car: Car;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private carService: CarService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInCars();
    }

    load(id) {
        this.carService.find(id).subscribe((car) => {
            this.car = car;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInCars() {
        this.eventSubscriber = this.eventManager.subscribe(
            'carListModification',
            (response) => this.load(this.car.id)
        );
    }
}
