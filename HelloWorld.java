///SOLUTIE DATA DE MINE - CAPITOL 1 EX. 1+2
package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
@Autonomous //aici schimbi ca sa apara diferit pe
//driver station. daca pun @TeleOp o sa apara la teleop
public class HelloWorld extends OpMode{
    @Override
    public void init()
    {  //Salut,eu!
        telemetry.addData("Hello","Sasha");
    }
    @Override
    public void loop()
    {

    }
}
