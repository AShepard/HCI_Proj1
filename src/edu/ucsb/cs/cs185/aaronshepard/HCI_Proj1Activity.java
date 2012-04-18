package edu.ucsb.cs.cs185.aaronshepard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HCI_Proj1Activity extends Activity {
    /** Called when the activity is first created. */
	
	//------------------------------------------------------
	// below link defines vertical and horizontal int values
	//http://developer.android.com/reference/android/widget/LinearLayout.html#VERTICAL
	//------------------------------------------------------
	private static final int VERTICAL = 1;
	private static final int HORIZONTAL = 0;
	private static final int CENTER_VERTICAL = 16;
	private static final int CENTER_HORIZONTAL = 15;
	private static final int CENTER = 17;
	
	private LinearLayout m_layout;
	private TextView tv_count_display;
	private Button b_change_count;
	
	private static final String m_button_text = "Click me !";
	private static final String m_output_1 = "You clicked ";
	private static final String m_output_2 = " times.";
	private int m_counter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        /*
         * Create text field and button without XML
         * clicking button increments textfield counter by 1
         */
        m_counter=0;
        
         
        //create text view to display count
        tv_count_display = new TextView(this);
        tv_count_display.setText(m_output_1 + m_counter + m_output_2);
        tv_count_display.setGravity(CENTER);
        //create button to update counter
        b_change_count = new Button(this);
        b_change_count.setText(m_button_text);
        
        //crate layout to store views
        m_layout = new LinearLayout(this);
        m_layout.setOrientation(VERTICAL);
        m_layout.setGravity(CENTER_HORIZONTAL);
        
        m_layout.addView(tv_count_display);
        m_layout.addView(b_change_count);
        
        //set content view to created layout
        setContentView(m_layout);
        
        //create listener for button
        b_change_count.setOnClickListener(new OnClickListener() {
			
			//@Override
			public void onClick(View v) {
				updateTextView();
				
			}
		});
    }
    
    public void updateTextView() {
    	m_counter++;
    	tv_count_display.setText(m_output_1 + m_counter + m_output_2);
    }
}