/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
//import edu.wpi.first.wpilibj.VictorSPX;

import com.ctre.phoenix.motorcontrol.ControlMode;


import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.Commands.*;

public class Elevator extends Subsystem {
  public VictorSPX elevator = new VictorSPX(1);


    public Elevator(){

    }

    @Override
    public void initDefaultCommand() {

       setDefaultCommand(new ElevatorCmd());
    }

    public void moveElevator(double speed){
      elevator.set(ControlMode.PercentOutput,speed*.5);
      System.out.println(speed);
    }

  }