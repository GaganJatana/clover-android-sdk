/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v1.printer.job;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clover.sdk.v1.printer.Category;

public class ReceiptPrintJob extends OrderBasedPrintJob implements Parcelable {
  public static class Builder extends OrderBasedPrintJob.Builder {

    public ReceiptPrintJob build() {
      return new ReceiptPrintJob(orderId, flags | FLAG_SALE);
    }
  }

  protected ReceiptPrintJob(String orderId, int flags) {
    super(orderId, flags);
  }

  @Override
  public Category getPrinterCategory() {
    return Category.RECEIPT;
  }

  public static final Parcelable.Creator<ReceiptPrintJob> CREATOR
      = new Parcelable.Creator<ReceiptPrintJob>() {
    public ReceiptPrintJob createFromParcel(Parcel in) {
      return new ReceiptPrintJob(in);
    }

    public ReceiptPrintJob[] newArray(int size) {
      return new ReceiptPrintJob[size];
    }
  };

  protected ReceiptPrintJob(Parcel in) {
    super(in);
    Bundle bundle = in.readBundle();
    // Add more data here, but remember old apps might not provide it!
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    Bundle bundle = new Bundle();
    // Add more stuff here

    dest.writeBundle(bundle);
  }
}