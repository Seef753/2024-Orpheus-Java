package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter_cannon extends SubsystemBase{
    private TalonFX cannonmotor1;
    private TalonFX cannonmotor2;

    public shooter_cannon(TalonFX motor1, TalonFX motor2){
        this.cannonmotor1 = motor1;
        this.cannonmotor2 = motor2;
    }
    
    public void shootit(){
        cannonmotor1.set(-0.4);
        cannonmotor2.set(0.4);
    }
    public void stop(){
        cannonmotor1.set(0.0);
        cannonmotor2.set(0.0);
    }
}
