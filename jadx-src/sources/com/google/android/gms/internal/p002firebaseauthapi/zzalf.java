package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzalf extends IOException {
    private boolean zza;

    public zzalf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zzk() {
        this.zza = true;
    }

    public zzalf(String str) {
        super(str);
    }

    static zzale zza() {
        return new zzale("Protocol message tag had invalid wire type.");
    }

    static zzalf zzb() {
        return new zzalf("Protocol message end-group tag did not match expected tag.");
    }

    static zzalf zzc() {
        return new zzalf("Protocol message contained an invalid tag (zero).");
    }

    static zzalf zzd() {
        return new zzalf("Protocol message had invalid UTF-8.");
    }

    static zzalf zze() {
        return new zzalf("CodedInputStream encountered a malformed varint.");
    }

    static zzalf zzf() {
        return new zzalf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzalf zzg() {
        return new zzalf("Failed to parse the message.");
    }

    static zzalf zzh() {
        return new zzalf("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static zzalf zzi() {
        return new zzalf("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    static zzalf zzj() {
        return new zzalf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final boolean zzl() {
        return this.zza;
    }

    public zzalf(String str, IOException iOException) {
        super(str, iOException);
    }
}
