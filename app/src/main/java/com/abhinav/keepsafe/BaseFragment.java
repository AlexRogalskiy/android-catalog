package com.abhinav.keepsafe;

import android.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.widget.Toolbar;
import android.widget.Toast;

import com.abhinav.keepsafe.base.IBaseView;

/**
 * Created by Abhinav on 23/04/17.
 */
public class BaseFragment extends Fragment implements IBaseView {

    public void setupToolbar(Toolbar toolbar) {
        ((BaseActivity) getActivity()).setSupportActionBar(toolbar);
    }

    public void setToolbarTitle(int titleResId) {
        ((BaseActivity) getActivity()).getSupportActionBar().setTitle(titleResId);
    }

    @Override
    public void showSnackbar(String msg) {
        Snackbar.make(null, msg, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void showToastLong(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showToastShort(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }
}
