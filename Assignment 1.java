//Julom, Nathalene S.
//BSIT - 3B
//Assignment 1: Activity Lifecycle

public class ActivityLifecycle extends AppCompatActivity {

    private static final String TAG = "LifecycleEvent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView wcText = findViewById(R.id.wc_text);
        wcText.setText("Welcome to the Activity Lifecycle!");

        Log.i(TAG, "onCreate: The activity is being created");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: The activity is now visible to the user");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: The activity is now active and ready for interaction");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Another activity is in front, but this one is still in memory");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: The activity is no longer visible");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: The activity is being removed from memory");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
