package elmeniawy.eslam.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import elmeniawy.eslam.retrofit.fragments.BarFragment;

public class MainActivity extends AppCompatActivity implements BarFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStartButtonClicked() {
        showToast("Start button clicked");
    }

    @Override
    public void onEndButtonClicked() {
        showToast("End button clicked");
    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
