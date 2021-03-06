/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.payments;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum CvmResult implements Parcelable {
  NO_CVM_REQUIRED, SIGNATURE, PIN, ONLINE_PIN, SIGNATURE_AND_PIN, CVM_FAILED, DEVICE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<CvmResult> CREATOR = new Creator<CvmResult>() {
    @Override
    public CvmResult createFromParcel(final Parcel source) {
      return CvmResult.valueOf(source.readString());
    }

    @Override
    public CvmResult[] newArray(final int size) {
      return new CvmResult[size];
    }
  };
}
