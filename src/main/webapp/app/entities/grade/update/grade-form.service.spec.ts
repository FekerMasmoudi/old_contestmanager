import { TestBed } from '@angular/core/testing';

import { sampleWithRequiredData, sampleWithNewData } from '../grade.test-samples';

import { GradeFormService } from './grade-form.service';

describe('Grade Form Service', () => {
  let service: GradeFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GradeFormService);
  });

  describe('Service methods', () => {
    describe('createGradeFormGroup', () => {
      it('should create a new form with FormControl', () => {
        const formGroup = service.createGradeFormGroup();

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            designation: expect.any(Object),
            ideducationlevel: expect.any(Object),
            idcertificate: expect.any(Object),
          })
        );
      });

      it('passing IGrade should create a new form with FormGroup', () => {
        const formGroup = service.createGradeFormGroup(sampleWithRequiredData);

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            designation: expect.any(Object),
            ideducationlevel: expect.any(Object),
            idcertificate: expect.any(Object),
          })
        );
      });
    });

    describe('getGrade', () => {
      it('should return NewGrade for default Grade initial value', () => {
        // eslint-disable-next-line @typescript-eslint/no-unused-vars
        const formGroup = service.createGradeFormGroup(sampleWithNewData);

        const grade = service.getGrade(formGroup) as any;

        expect(grade).toMatchObject(sampleWithNewData);
      });

      it('should return NewGrade for empty Grade initial value', () => {
        const formGroup = service.createGradeFormGroup();

        const grade = service.getGrade(formGroup) as any;

        expect(grade).toMatchObject({});
      });

      it('should return IGrade', () => {
        const formGroup = service.createGradeFormGroup(sampleWithRequiredData);

        const grade = service.getGrade(formGroup) as any;

        expect(grade).toMatchObject(sampleWithRequiredData);
      });
    });

    describe('resetForm', () => {
      it('passing IGrade should not enable id FormControl', () => {
        const formGroup = service.createGradeFormGroup();
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, sampleWithRequiredData);

        expect(formGroup.controls.id.disabled).toBe(true);
      });

      it('passing NewGrade should disable id FormControl', () => {
        const formGroup = service.createGradeFormGroup(sampleWithRequiredData);
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, { id: null });

        expect(formGroup.controls.id.disabled).toBe(true);
      });
    });
  });
});
