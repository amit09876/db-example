package net.simplifiedcoding.dbexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextClass, editTextSession;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextClass = findViewById(R.id.editTextClass);
        editTextName = findViewById(R.id.editTextName);
        editTextSession = findViewById(R.id.editTextSession);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveStudent();
            }
        });
    }

    private void saveStudent(){
       String name = editTextName.getText().toString().trim();
       String sClass = editTextClass.getText().toString().trim();
       String session = editTextSession.getText().toString().trim();

       //add validations


        DbHandler db = new DbHandler(this);

        Student student = new Student(0, name, sClass, session);

        db.addStudent(student);

        Toast.makeText(this, "Student saved", Toast.LENGTH_LONG).show();

    }
}
