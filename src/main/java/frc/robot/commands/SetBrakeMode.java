// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

/**
 * A command to drive the robot with joystick input (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes - actual code should inline a command this simple with {@link
 * edu.wpi.first.wpilibj2.command.RunCommand}.
 */
public class SetBrakeMode extends CommandBase {
  private final DriveSubsystem m_DriveSubsystem;
    private final BooleanSupplier m_brakeMode;

  /**
   * Creates a new DefaultDrive.
   *
   * @param driveSubsystem The drive subsystem
   * @param brakeMode whether to brake or coast, braking is true
   */
  //TODO create a constructor here

  @Override
  public void execute() {
    //TODO call the drive method of the drive subsystem
  }
}
