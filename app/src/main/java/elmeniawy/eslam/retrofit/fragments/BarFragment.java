package elmeniawy.eslam.retrofit.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import elmeniawy.eslam.retrofit.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BarFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class BarFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;

    public BarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bar, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onStart() {
        super.onStart();
        ((AppCompatTextView) getView().findViewById(R.id.title_text)).setText(getView().getTag().toString());
        getView().findViewById(R.id.button_start).setOnClickListener(this);
        getView().findViewById(R.id.button_end).setOnClickListener(this);
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onClick(View v) {
        if (mListener != null) {
            if (v == getView().findViewById(R.id.button_start)) {
                mListener.onStartButtonClicked();
            } else if (v == getView().findViewById(R.id.button_end)) {
                mListener.onEndButtonClicked();
            }
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onStartButtonClicked();
        void onEndButtonClicked();
    }
}
