import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ImageView;

import com.example.dailog.Dailog;
import com.example.dailog.R;

public class ImageSliderDailog extends Dailog {

    private ImageView imageView;
    private int[] imageIds;
    private int currentIndex = 0;
    private int delay;
    private boolean keepSwitching;
    private Handler handler;

    public ImageSliderDailog(Context context, int[] imageIds, int delay, boolean keepSwitching) {
        super(context);
        this.imageIds = imageIds;
        this.delay = delay;
        this.keepSwitching = keepSwitching;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        onCreate(R.layout.image_slider_dialog);
        imageView = findViewById(R.id.imageView);
        handler = new Handler();

        startImageSlider();
    }

    private void onCreate(int imageSliderDialog) {
    }

    private ImageView findViewById(int imageView) {
        return null;
    }

    private void requestWindowFeature(int featureNoTitle) {

    }

    private Runnable imageSliderRunnable = new Runnable() {
        @Override
        public void run() {
            if (currentIndex < imageIds.length) {
                imageView.setImageResource(imageIds[currentIndex]);
                currentIndex++;
            } else if (keepSwitching) {
                currentIndex = 0;
                imageView.setImageResource(imageIds[currentIndex]);
            } else {
                dismiss();
                return;
            }

            handler.postDelayed(this, delay);
        }
    };

    private void dismiss() {
    }

    private void startImageSlider() {
        handler.postDelayed(imageSliderRunnable, delay);
    }
}
