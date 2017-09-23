/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async, inject } from '@angular/core/testing';
import { OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils, JhiDataUtils, JhiEventManager } from 'ng-jhipster';
import { GatewayTestModule } from '../../../test.module';
import { MockActivatedRoute } from '../../../helpers/mock-route.service';
import { CarDetailComponent } from '../../../../../../main/webapp/app/entities/car/car-detail.component';
import { CarService } from '../../../../../../main/webapp/app/entities/car/car.service';
import { Car } from '../../../../../../main/webapp/app/entities/car/car.model';

describe('Component Tests', () => {

    describe('Car Management Detail Component', () => {
        let comp: CarDetailComponent;
        let fixture: ComponentFixture<CarDetailComponent>;
        let service: CarService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [GatewayTestModule],
                declarations: [CarDetailComponent],
                providers: [
                    JhiDateUtils,
                    JhiDataUtils,
                    DatePipe,
                    {
                        provide: ActivatedRoute,
                        useValue: new MockActivatedRoute({id: 123})
                    },
                    CarService,
                    JhiEventManager
                ]
            }).overrideTemplate(CarDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(CarDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(CarService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
            // GIVEN

            spyOn(service, 'find').and.returnValue(Observable.of(new Car(10)));

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.find).toHaveBeenCalledWith(123);
            expect(comp.car).toEqual(jasmine.objectContaining({id: 10}));
            });
        });
    });

});
