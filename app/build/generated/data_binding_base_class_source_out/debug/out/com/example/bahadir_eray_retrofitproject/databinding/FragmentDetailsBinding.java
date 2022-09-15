// Generated by view binder compiler. Do not edit!
package com.example.bahadir_eray_retrofitproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bahadir_eray_retrofitproject.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView imageViewDetail;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView marsIdDetails;

  @NonNull
  public final TextView marsPriceDetails;

  @NonNull
  public final TextView marsTypeDetails;

  private FragmentDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView imageViewDetail, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout3, @NonNull TextView marsIdDetails,
      @NonNull TextView marsPriceDetails, @NonNull TextView marsTypeDetails) {
    this.rootView = rootView;
    this.imageViewDetail = imageViewDetail;
    this.linearLayout = linearLayout;
    this.linearLayout3 = linearLayout3;
    this.marsIdDetails = marsIdDetails;
    this.marsPriceDetails = marsPriceDetails;
    this.marsTypeDetails = marsTypeDetails;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewDetail;
      CircleImageView imageViewDetail = ViewBindings.findChildViewById(rootView, id);
      if (imageViewDetail == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.marsIdDetails;
      TextView marsIdDetails = ViewBindings.findChildViewById(rootView, id);
      if (marsIdDetails == null) {
        break missingId;
      }

      id = R.id.marsPriceDetails;
      TextView marsPriceDetails = ViewBindings.findChildViewById(rootView, id);
      if (marsPriceDetails == null) {
        break missingId;
      }

      id = R.id.marsTypeDetails;
      TextView marsTypeDetails = ViewBindings.findChildViewById(rootView, id);
      if (marsTypeDetails == null) {
        break missingId;
      }

      return new FragmentDetailsBinding((ConstraintLayout) rootView, imageViewDetail, linearLayout,
          linearLayout3, marsIdDetails, marsPriceDetails, marsTypeDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
