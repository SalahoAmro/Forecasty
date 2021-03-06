// Generated by view binder compiler. Do not edit!
package com.narify.forecasty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.narify.forecasty.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPickPlaceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAutoDetectLocation;

  @NonNull
  public final EditText etSearchPlace;

  @NonNull
  public final FloatingActionButton fabSearch;

  @NonNull
  public final RecyclerView rvPlaceList;

  @NonNull
  public final TextView tvCurrentLocation;

  private ActivityPickPlaceBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAutoDetectLocation, @NonNull EditText etSearchPlace,
      @NonNull FloatingActionButton fabSearch, @NonNull RecyclerView rvPlaceList,
      @NonNull TextView tvCurrentLocation) {
    this.rootView = rootView;
    this.btnAutoDetectLocation = btnAutoDetectLocation;
    this.etSearchPlace = etSearchPlace;
    this.fabSearch = fabSearch;
    this.rvPlaceList = rvPlaceList;
    this.tvCurrentLocation = tvCurrentLocation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPickPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPickPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pick_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPickPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_auto_detect_location;
      Button btnAutoDetectLocation = rootView.findViewById(id);
      if (btnAutoDetectLocation == null) {
        break missingId;
      }

      id = R.id.et_search_place;
      EditText etSearchPlace = rootView.findViewById(id);
      if (etSearchPlace == null) {
        break missingId;
      }

      id = R.id.fab_search;
      FloatingActionButton fabSearch = rootView.findViewById(id);
      if (fabSearch == null) {
        break missingId;
      }

      id = R.id.rv_place_list;
      RecyclerView rvPlaceList = rootView.findViewById(id);
      if (rvPlaceList == null) {
        break missingId;
      }

      id = R.id.tv_current_location;
      TextView tvCurrentLocation = rootView.findViewById(id);
      if (tvCurrentLocation == null) {
        break missingId;
      }

      return new ActivityPickPlaceBinding((ConstraintLayout) rootView, btnAutoDetectLocation,
          etSearchPlace, fabSearch, rvPlaceList, tvCurrentLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
