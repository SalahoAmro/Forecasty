// Generated by view binder compiler. Do not edit!
package com.narify.forecasty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.narify.forecasty.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentDetailForecastBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView rvWeatherDetailsList;

  private FragmentDetailForecastBinding(@NonNull RecyclerView rootView,
      @NonNull RecyclerView rvWeatherDetailsList) {
    this.rootView = rootView;
    this.rvWeatherDetailsList = rvWeatherDetailsList;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailForecastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailForecastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail_forecast, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailForecastBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView rvWeatherDetailsList = (RecyclerView) rootView;

    return new FragmentDetailForecastBinding((RecyclerView) rootView, rvWeatherDetailsList);
  }
}
