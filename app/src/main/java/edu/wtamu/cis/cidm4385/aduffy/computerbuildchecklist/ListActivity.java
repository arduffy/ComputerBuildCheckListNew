package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
//    private ArrayList selection;

    ArrayList<String> selection = new ArrayList<String>();
//    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        final_text = (TextView) findViewById(R.id.final_result);
//        final_text.setEnabled(false);

    }

    public void selectItem(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.part_tower:

                if (checked) {
                    selection.add("ATX Tower Case");
                } else {
                    selection.remove("ATX Tower Case");
                }
                break;

            case R.id.part_power:

                if (checked) {
                    selection.add("Power Supply");
                } else {
                    selection.remove("Power Supply");
                }
                break;

            case R.id.part_cpu:

                if (checked) {
                    selection.add("CPU");
                } else {
                    selection.remove("CPU");
                }
                break;

            case R.id.part_board:

                if (checked) {
                    selection.add("Mother Board");
                } else {
                    selection.remove("Mother Board");
                }
                break;

            case R.id.part_processor:

                if (checked) {
                    selection.add("Processor");
                } else {
                    selection.remove("Processor");
                }
                break;

            case R.id.part_memory:

                if (checked) {
                    selection.add("RAM Memory");
                } else {
                    selection.remove("RAM Memory");
                }
                break;

            case R.id.part_hard_drive:

                if (checked) {
                    selection.add("Hard Drive");
                } else {
                    selection.remove("Hard Drive");
                }
                break;

            case R.id.part_video_card:

                if (checked) {
                    selection.add("Graphics/Video Card");
                } else {
                    selection.remove("Graphics/Video Card");
                }
                break;

            case R.id.part_sound_card:

                if (checked) {
                    selection.add("Sound Card");
                } else {
                    selection.remove("Sound Card");
                }
                break;

            case R.id.part_fan:

                if (checked) {
                    selection.add("Cooling Fan");
                } else {
                    selection.remove("Cooling Fan");
                }
                break;
        }

    }
}
