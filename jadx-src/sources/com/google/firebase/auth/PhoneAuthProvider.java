package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class PhoneAuthProvider {

    @SafeParcelable.Class(creator = "DefaultForceResendingTokenCreator")
    public static class ForceResendingToken extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new iwV();

        public static ForceResendingToken T3L() {
            return new ForceResendingToken();
        }

        ForceResendingToken() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
        }
    }

    public static abstract class j {
        private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

        public abstract void onCodeSent(String str, ForceResendingToken forceResendingToken);

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(FirebaseException firebaseException);

        public void onCodeAutoRetrievalTimeOut(@NonNull String str) {
            zza.i("Sms auto retrieval timed-out.", new Object[0]);
        }
    }

    public static PhoneAuthCredential n(String str, String str2) {
        return PhoneAuthCredential.f(str, str2);
    }

    public static void rl(Pl pl) {
        Preconditions.checkNotNull(pl);
        FirebaseAuth.E(pl);
    }
}
