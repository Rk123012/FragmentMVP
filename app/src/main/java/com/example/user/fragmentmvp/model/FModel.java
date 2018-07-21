package com.example.user.fragmentmvp.model;

import com.example.user.fragmentmvp.presenter.Fpresenter;
import com.example.user.fragmentmvp.view.Fview;

/**
 * Created by User on 7/22/2018.
 */

public class FModel implements Fpresenter{
    Fview ffview;
    public FModel(Fview fview) {
        ffview=fview;

    }

    @Override
    public void fragment_jony() {
        ffview.show_jony();

    }

    @Override
    public void fragment_milon() {
          ffview.show_milon();
    }
}
