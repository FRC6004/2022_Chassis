/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;
import frc.robot.OI;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class ElevatorCmd extends Command {
  public static OI m_oi;
  public ElevatorCmd() {
    requires(Robot.elevatorSub);
  }

  @Override
  protected void initialize() {
    Robot.elevatorSub.initDefaultCommand();
  }


  @Override
  protected void execute() {
    if(Robot.m_oi.elevatorUp.get()){
      Robot.elevatorSub.moveElevator(1);
    }
    else if(Robot.m_oi.elevatorDown.get()){
      Robot.elevatorSub.moveElevator(-1);
    }
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
    end();
  }
}
