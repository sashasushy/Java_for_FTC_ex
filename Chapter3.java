package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Chapter3 extends OpMode {
    @Override
    public void init()
    {

    }
    @Override
    public void loop()
    {
        //1. Add telemetry to show the right stick of gamepad1.
        //The right stick has (both of them actually)
        //can be used to find 3 things: 2 double values between -1 and 1 and 1 bolean value
        //as a challenge I want to output not only the x and y values but the angle of the joycon
        //First, the values that the joycon provides:
        double y=-1*gamepad1.right_stick_y;
        double x=gamepad1.right_stick_x;
        telemetry.addData("Y value:",y); // cum mentioneaza si in document y este inversat fata de cum ar fi normal :/
        telemetry.addData("X value:",x);
        telemetry.addData("Is pressed?:", gamepad1.right_stick_button);
        //pentru asta, aparent avem o functie care rezolva asta fara sa ma mai complic cu cadranele tangentei care returneaza unghiuri intre -pi si pi
        //totusi daca as face asta manual ( ca sa imi complic existenta :)) ) calculez tangenta, dar tot trebuie apelat o functie pentru arctangenta(Math.atan) si trebuie modificat valuarea in cadranele II si III.
        //ok gata cu vorbaraia hai cu codul
        double unghi_rad=Math.atan2(y,x); // unghi masurat ca la trigonometrie si nu fata de "normala" (Oy)
        double unghi_grad=Math.toDegrees(unghi_rad);
        //asa am aflat intre -180 si 180. daca vrem 0-360 acesta devine
        if(unghi_grad<0)
            unghi_grad+=360;
        telemetry.addData("Unghiul este de: (in grade):",unghi_grad);
        //GATA PRIMUL EXERCITIU
        //2.
        telemetry.addData("Este butonul b apasat?",gamepad1.b);
        //3.
        telemetry.addData("Diferenta este:",gamepad1.right_stick_y-gamepad1.left_stick_y); // diferenta este inversata pt ca ,din nou, semnul la y este invers. Mai curat stocai in variabile separate si faceai diferenta dar este ok si asa
        //4.
        telemetry.addData("Suma este:",gamepad1.left_trigger+gamepad1.right_trigger);
        //pana acum am rezolvat in init exercitiile. I mean, oricum sunt "coduri jucarie" dar in general cred ca e mai bine in loop sa le pun ( in init daca le rulez practic nu o sa cam faca nmk)
    }
}
