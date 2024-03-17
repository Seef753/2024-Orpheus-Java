package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{
    private TalonFX  intakemotor = new TalonFX(5);

    public intake(){
    }
    @Override
    public void periodic () {
    }
    
    public void setspeed(double volts){
        intakemotor.setVoltage(volts);
    }

    public void stop(){
        in.stopMotor();
    }
}
