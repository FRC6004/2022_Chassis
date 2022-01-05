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
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.VictorSP;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.Commands.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {

    public VictorSP _leftMaster = new VictorSP(RobotMap.DRIVETRAIN_LEFT_FRONT);
    public VictorSP _rightMaster = new VictorSP(RobotMap.DRIVETRAIN_RIGHT_FRONT);
    public VictorSP  _leftFollow = new VictorSP (RobotMap.DRIVETRAIN_LEFT_BACK);
    public VictorSP  _rightFollow = new VictorSP (RobotMap.DRIVETRAIN_RIGHT_BACK);
    public DifferentialDrive _drive = new DifferentialDrive(_leftMaster, _rightMaster);
    public static OI m_oi;

    public DriveTrain(){
      
      _leftFollow.set(_leftMaster.getSpeed());
      _rightFollow.set(_rightMaster.getSpeed());
      
      _leftMaster.setInverted(false);
      _rightMaster.setInverted(true);
      _leftFollow.setInverted(false);
      _rightFollow.setInverted(true);

      _drive = new DifferentialDrive(_leftMaster,_rightMaster);
    }

    @Override
    public void initDefaultCommand() {

       setDefaultCommand(new ArcadeDrive());
    }
    public void drive(double leftPower, double rightPower) {
      _leftMaster.set(leftPower);
      _leftFollow.set(leftPower);
      _rightMaster.set(rightPower);
      _rightFollow.set(rightPower);
  }

  public void stopDrive() {
      _leftMaster.set(0);
      _leftFollow.set(0);
      _rightMaster.set(0);
      _rightFollow.set(0);
  }

      public void arcadeDrive(double speed, double turn){

        _drive.arcadeDrive(-speed, turn);
      }
      @Override
      public void periodic() {

      }
  }
