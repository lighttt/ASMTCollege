package np.edu.asm.asmt;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class ASMT extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
