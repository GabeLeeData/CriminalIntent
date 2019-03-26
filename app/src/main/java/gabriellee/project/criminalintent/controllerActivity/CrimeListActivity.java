package gabriellee.project.criminalintent.controllerActivity;

import android.support.v4.app.Fragment;

import gabriellee.project.criminalintent.controllerFragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
