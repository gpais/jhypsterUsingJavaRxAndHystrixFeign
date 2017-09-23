import { BaseEntity } from './../../shared';

export class Car implements BaseEntity {
    constructor(
        public id?: number,
        public plate?: string,
        public brand?: string,
        public year?: string,
        public doors?: string,
    ) {
    }
}
