import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuAgentComponent } from './menu-agent.component';

describe('MenuAgentComponent', () => {
  let component: MenuAgentComponent;
  let fixture: ComponentFixture<MenuAgentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuAgentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuAgentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
