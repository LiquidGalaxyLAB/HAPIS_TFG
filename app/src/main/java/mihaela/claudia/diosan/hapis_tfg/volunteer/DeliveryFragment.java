package mihaela.claudia.diosan.hapis_tfg.volunteer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mihaela.claudia.diosan.hapis_tfg.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeliveryFragment extends Fragment {

    public DeliveryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivery, container, false);
    }
}
