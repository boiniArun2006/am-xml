package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdpk implements GestureDetector.OnGestureListener {

    @GuardedBy
    private final zzdoc zza;
    private final zzdpc zzb;

    zzdpk(zzdoc zzdocVar, zzdpc zzdpcVar) {
        this.zza = zzdocVar;
        this.zzb = zzdpcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:23:0x0064, B:25:0x006a, B:15:0x0030, B:19:0x0044, B:22:0x0057), top: B:32:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
        int y2;
        try {
            zzdoc zzdocVar = this.zza;
            if (zzdocVar != null) {
                int i2 = -1;
                if (Math.abs(f3) > Math.abs(f4)) {
                    if (f3 > 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f3) * 1000.0f);
                        i2 = 1;
                    } else if (f3 < 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f3) * 1000.0f);
                        i2 = 2;
                    } else {
                        y2 = 0;
                    }
                    if (i2 == zzdocVar.zzG()) {
                        zzdocVar.zzE(this.zzb.zzr(), y2);
                        return false;
                    }
                } else {
                    if (f4 > 0.0f) {
                        y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f4) * 1000.0f);
                        i2 = 8;
                    } else if (f4 < 0.0f) {
                        y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f4) * 1000.0f);
                        i2 = 4;
                    }
                    if (i2 == zzdocVar.zzG()) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
