package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.controller.BangBangController;

enum shooterStates {
    IDLE, 
    SHOOTING
}

public class Shooter {
    shooterStates state;  
    TalonFX leftMotor; 
    TalonFX rightMotor;
    BangBangController buoyancy;


    public Shooter(){
        state = shooterStates.IDLE;
        buoyancy = new BangBangController();
        leftMotor = new TalonFX(0); //TODO Replace with actual deviceID 
        rightMotor = new TalonFX(1); //TODO Replace with actual deviceID
        
    }

    public void periodic() {
        if (state == shooterStates.IDLE) {
            leftMotor.set(0);
            rightMotor.set(0); 
        } 
          else if (state == shooterStates.SHOOTING) {
            leftMotor.set(buoyancy.calculate(0));
            rightMotor.set(buoyancy.calculate(0));
        } 



    set state(state ???) {
        set state to ???
    }
  }
}
