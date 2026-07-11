package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@VisibleForTesting
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    @VisibleForTesting
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Builder setLoiteringDelay(int i2) {
            this.zzi = i2;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange int i2) {
            this.zzh = i2;
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i2) {
            this.zzb = i2;
            return this;
        }

        @NonNull
        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i2 = this.zzb;
            if (i2 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i2 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j2 = this.zzc;
            if (j2 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i3 = this.zzh;
            if (i3 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i2, (short) 1, this.zze, this.zzf, this.zzg, j2, i3, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public Builder setExpirationDuration(long j2) {
            if (j2 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j2;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange double d2, @FloatRange double d4, @FloatRange float f3) {
            boolean z2;
            boolean z3;
            boolean z4 = false;
            if (d2 >= -90.0d && d2 <= 90.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d2);
            Preconditions.checkArgument(z2, sb.toString());
            if (d4 >= -180.0d && d4 <= 180.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d4);
            Preconditions.checkArgument(z3, sb2.toString());
            if (f3 > 0.0f) {
                z4 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f3);
            Preconditions.checkArgument(z4, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d2;
            this.zzf = d4;
            this.zzg = f3;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    @NonNull
    String getRequestId();
}
