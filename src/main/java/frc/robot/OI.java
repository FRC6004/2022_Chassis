/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.POVButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick _driver = new Joystick(RobotMap.OI_DRIVER_CONTROLLER);
  public Joystick _operator = new Joystick(RobotMap.OI_OP_CONTROLLER);

  public Button elevatorUp = new JoystickButton(_driver,5);
  public Button elevatorDown = new JoystickButton(_driver,3);
  
  public OI() {
    
    // RunBack.whenReleased(new FixedDriveStop());
  

  }
}
