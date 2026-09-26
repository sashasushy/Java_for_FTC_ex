package org.firstinspires.ftc.teamcode;
///SOLUTIE DATA DE MINE - CAPITOL 2 EX. 1+2
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseString extends OpMode {
    @Override
    public void init()
    {
        String numele_meu="Sasha Venedict";
        int nota=10;
        telemetry.addData("Ma cheama (nu bors cu zeama) ci:", numele_meu);
        telemetry.addData("Media mea pt clasele 5-9 este", nota);
    }
    @Override
    public void loop()
    {

    }
}
