package frc.robot.subsystems;

import java.security.PublicKey;

import org.ejml.dense.row.CommonOps_MT_CDRM;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.DeferredCommand;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class TestHood extends SubsystemBase{
    public TalonFX leadMotor = new TalonFX(0);


    public Command setSpeed(){
        return new InstantCommand(
          () -> {
            leadMotor.set(0.50);
          });
    }

    public Command stopTheStupidMotor(){
        return new InstantCommand(
            () -> {
                leadMotor.set(0);
            });
    }



    }
    



