package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqu;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzis implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjc zzc;

    zzis(zzjc zzjcVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x044b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0461 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0290 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028a->B:87:0x0290, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034d A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e9 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032c, B:91:0x0340, B:93:0x034d, B:96:0x03a7, B:97:0x03e3, B:99:0x03e9, B:101:0x03fa, B:102:0x0405, B:104:0x044b, B:105:0x0459, B:107:0x0461, B:108:0x0464, B:110:0x046c, B:113:0x0475, B:116:0x048a, B:117:0x048d, B:112:0x0472, B:95:0x038b, B:83:0x0262, B:123:0x050d), top: B:134:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpf zzpfVar;
        String strZzc;
        zzpf zzpfVar2;
        List listZzn;
        Iterator it;
        zzpm zzpmVar;
        int i2;
        zzib zzibVar;
        zzbc zzbcVarZzf;
        zzpf zzpfVar3;
        zzh zzhVar;
        zzib zzibVar2;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        Bundle bundle;
        String str;
        Object obj;
        boolean z2;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        zzbc zzbcVarZza;
        long j2;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzk;
        zzbd zzbdVar;
        long jZzp;
        long jZzn;
        String strZzh;
        byte[] bArr2;
        zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        zzlo zzloVarZzn = zzjcVar.zzL().zzn();
        zzloVarZzn.zzg();
        zzib zzibVar3 = zzloVarZzn.zzu;
        zzib.zzL();
        zzbg zzbgVar = this.zza;
        Preconditions.checkNotNull(zzbgVar);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbgVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzloVarZzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpf zzpfVar4 = zzloVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpfVar4.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpfVar4.zzj().zzu(str2);
            if (zzhVarZzu == null) {
                zzloVarZzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC(AppLovinBridge.f61290h);
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjk zzjkVarZzB = zzloVarZzn.zzg.zzB(str2);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzibVar3.zzB() && zzloVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjkVarZzB.zzo(zzjj.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjkVarZzB.zzk());
                    if (zzjkVarZzB.zzo(zzjj.AD_STORAGE) && zzhVarZzu.zzac()) {
                        Pair pairZzc = zzpfVar4.zzq().zzc(zzhVarZzu.zzc(), zzjkVarZzB);
                        if (zzhVarZzu.zzac() && !TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                            try {
                                zzicVarZzaE.zzQ(zzlo.zzc((String) pairZzc.first, Long.toString(zzbgVar.zzd)));
                                Object obj2 = pairZzc.second;
                                if (obj2 != null) {
                                    zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                                }
                                zzib zzibVar4 = zzloVarZzn.zzu;
                                zzibVar4.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzibVar4.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzibVar4.zzu().zzb());
                                zzicVarZzaE.zzH(zzibVar4.zzu().zzc());
                                if (zzjkVarZzB.zzo(zzjj.ANALYTICS_STORAGE)) {
                                    zzicVarZzaE.zzW(zzlo.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                }
                                strZzc = zzhVarZzu.zzc();
                                zzpfVar2 = zzloVarZzn.zzg;
                                listZzn = zzpfVar2.zzj().zzn(strZzc);
                                it = listZzn.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                if (zzpmVar != null) {
                                    zzpm zzpmVar2 = new zzpm(strZzc, TtmlNode.TEXT_EMPHASIS_AUTO, "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                    listZzn.add(zzpmVar2);
                                    zzpfVar2.zzj().zzl(zzpmVar2);
                                }
                                com.google.android.gms.internal.measurement.zziu[] zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                                while (i2 < listZzn.size()) {
                                }
                                zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                                zzpf zzpfVar5 = zzloVarZzn.zzg;
                                zzpfVar5.zzI(zzhVarZzu, zzicVarZzaE);
                                zzpfVar5.zzJ(zzhVarZzu, zzicVarZzaE);
                                zzgu zzguVarZza = zzgu.zza(zzbgVar);
                                zzibVar = zzloVarZzn.zzu;
                                zzpo zzpoVarZzk = zzibVar.zzk();
                                Bundle bundle2 = zzguVarZza.zzd;
                                zzpoVarZzk.zzI(bundle2, zzpfVar2.zzj().zzW(str2));
                                zzibVar.zzk().zzG(zzguVarZza, zzibVar.zzc().zzd(str2));
                                bundle2.putLong("_c", 1L);
                                zzibVar.zzaV().zzj().zza(obbPUqyhtS.pwCJ);
                                bundle2.putLong("_r", 1L);
                                String str4 = zzbgVar.zzc;
                                bundle2.putString("_o", str4);
                                if (zzibVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                }
                                zzav zzavVarZzj = zzpfVar2.zzj();
                                String str5 = zzbgVar.zza;
                                zzbcVarZzf = zzavVarZzj.zzf(str2, str5);
                                if (zzbcVarZzf != null) {
                                }
                                zzbc zzbcVar = zzbcVarZza;
                                zzpfVar2.zzj().zzh(zzbcVar);
                                zzib zzibVar5 = zzloVarZzn.zzu;
                                long j3 = zzbgVar.zzd;
                                zzh zzhVar2 = zzhVar;
                                zzicVar2 = zzicVar;
                                zzpf zzpfVar6 = zzpfVar3;
                                boolean z3 = z2;
                                zzbb zzbbVar = new zzbb(zzibVar5, str, str2, str5, j3, j2, bundle);
                                zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                                zzhrVarZzk.zzo(zzbbVar.zzd);
                                zzhrVarZzk.zzl(zzbbVar.zzb);
                                zzhrVarZzk.zzq(zzbbVar.zze);
                                zzbe zzbeVar = zzbbVar.zzf;
                                zzbdVar = new zzbd(zzbeVar);
                                while (zzbdVar.hasNext()) {
                                }
                                zzicVar2.zzg(zzhrVarZzk);
                                com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                                com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                                zzhtVarZza.zzb(zzbcVar.zzc);
                                zzhtVarZza.zza(str5);
                                zzieVarZza.zza(zzhtVarZza);
                                zzicVar2.zzap(zzieVarZza);
                                zzicVar2.zzaf(zzpfVar2.zzm().zzb(zzhVar2.zzc(), Collections.EMPTY_LIST, zzicVar2.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                                if (zzhrVarZzk.zzm()) {
                                }
                                jZzp = zzhVar2.zzp();
                                if (jZzp != 0) {
                                }
                                jZzn = zzhVar2.zzn();
                                if (jZzn == 0) {
                                }
                                strZzh = zzhVar2.zzh();
                                zzqu.zza();
                                if (zzibVar2.zzc().zzp(str2, zzfx.zzaM)) {
                                    zzicVar2.zzau(strZzh);
                                }
                                zzhVar2.zzL();
                                zzicVar2.zzZ((int) zzhVar2.zzG());
                                zzibVar2.zzc().zzi();
                                zzicVar2.zzO(130000L);
                                zzicVar2.zzs(zzibVar2.zzaZ().currentTimeMillis());
                                zzicVar2.zzae(z3);
                                zzpfVar6.zzS(zzicVar2.zzK(), zzicVar2);
                                zzhzVar.zze(zzicVar2);
                                zzhVar2.zzo(zzicVar2.zzu());
                                zzhVar2.zzq(zzicVar2.zzw());
                                zzpfVar2.zzj().zzv(zzhVar2, false, false);
                                zzpfVar2.zzj().zzc();
                                zzpfVar2.zzj().zzd();
                                return zzpfVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (SecurityException e2) {
                                zzloVarZzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e2.getMessage());
                                bArr = new byte[0];
                                zzpfVar = zzloVarZzn.zzg;
                            }
                        }
                    } else {
                        zzib zzibVar42 = zzloVarZzn.zzu;
                        zzibVar42.zzu().zzw();
                        zzicVarZzaE.zzF(Build.MODEL);
                        zzibVar42.zzu().zzw();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) zzibVar42.zzu().zzb());
                        zzicVarZzaE.zzH(zzibVar42.zzu().zzc());
                        try {
                            if (zzjkVarZzB.zzo(zzjj.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlo.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpfVar2 = zzloVarZzn.zzg;
                            listZzn = zzpfVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    zzpmVar = null;
                                    break;
                                }
                                zzpmVar = (zzpm) it.next();
                                if ("_lte".equals(zzpmVar.zzc)) {
                                    break;
                                }
                            }
                            if (zzpmVar != null || zzpmVar.zze == null) {
                                zzpm zzpmVar22 = new zzpm(strZzc, TtmlNode.TEXT_EMPHASIS_AUTO, "_lte", zzloVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpmVar22);
                                zzpfVar2.zzj().zzl(zzpmVar22);
                            }
                            com.google.android.gms.internal.measurement.zziu[] zziuVarArr2 = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i2 = 0; i2 < listZzn.size(); i2++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpm) listZzn.get(i2)).zzc);
                                zzitVarZzm.zza(((zzpm) listZzn.get(i2)).zzd);
                                zzpfVar2.zzp().zzc(zzitVarZzm, ((zzpm) listZzn.get(i2)).zze);
                                zziuVarArr2[i2] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr2));
                            zzpf zzpfVar52 = zzloVarZzn.zzg;
                            zzpfVar52.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpfVar52.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgu zzguVarZza2 = zzgu.zza(zzbgVar);
                            zzibVar = zzloVarZzn.zzu;
                            zzpo zzpoVarZzk2 = zzibVar.zzk();
                            Bundle bundle22 = zzguVarZza2.zzd;
                            zzpoVarZzk2.zzI(bundle22, zzpfVar2.zzj().zzW(str2));
                            zzibVar.zzk().zzG(zzguVarZza2, zzibVar.zzc().zzd(str2));
                            bundle22.putLong("_c", 1L);
                            zzibVar.zzaV().zzj().zza(obbPUqyhtS.pwCJ);
                            bundle22.putLong("_r", 1L);
                            String str42 = zzbgVar.zzc;
                            bundle22.putString("_o", str42);
                            if (zzibVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzibVar.zzk().zzM(bundle22, "_dbg", 1L);
                                zzibVar.zzk().zzM(bundle22, "_r", 1L);
                            }
                            zzav zzavVarZzj2 = zzpfVar2.zzj();
                            String str52 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj2.zzf(str2, str52);
                            if (zzbcVarZzf != null) {
                                zzhVar = zzhVarZzu;
                                zzibVar2 = zzibVar;
                                zzicVar = zzicVarZzaE;
                                zzpfVar3 = zzpfVar52;
                                obj = null;
                                z2 = true;
                                str = str42;
                                bundle = bundle22;
                                zzbcVarZza = new zzbc(str2, str52, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j2 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpfVar3 = zzpfVar52;
                                zzhVar = zzhVarZzu;
                                zzibVar2 = zzibVar;
                                zzicVar = zzicVarZzaE;
                                bundle = bundle22;
                                str = str42;
                                obj = null;
                                z2 = true;
                                zzhzVar = zzhzVarZzh;
                                long j4 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j2 = j4;
                            }
                            zzbc zzbcVar2 = zzbcVarZza;
                            zzpfVar2.zzj().zzh(zzbcVar2);
                            zzib zzibVar52 = zzloVarZzn.zzu;
                            long j32 = zzbgVar.zzd;
                            zzh zzhVar22 = zzhVar;
                            zzicVar2 = zzicVar;
                            zzpf zzpfVar62 = zzpfVar3;
                            boolean z32 = z2;
                            zzbb zzbbVar2 = new zzbb(zzibVar52, str, str2, str52, j32, j2, bundle);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar2.zzd);
                            zzhrVarZzk.zzl(zzbbVar2.zzb);
                            zzhrVarZzk.zzq(zzbbVar2.zze);
                            zzbe zzbeVar2 = zzbbVar2.zzf;
                            zzbdVar = new zzbd(zzbeVar2);
                            while (zzbdVar.hasNext()) {
                                String next = zzbdVar.next();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                Object objZza = zzbeVar2.zza(next);
                                if (objZza != null) {
                                    zzpfVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVar2.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbcVar2.zzc);
                            zzhtVarZza2.zza(str52);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVar2.zzap(zzieVarZza2);
                            zzicVar2.zzaf(zzpfVar2.zzm().zzb(zzhVar22.zzc(), Collections.EMPTY_LIST, zzicVar2.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVar2.zzv(zzhrVarZzk.zzn());
                                zzicVar2.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVar22.zzp();
                            if (jZzp != 0) {
                                zzicVar2.zzA(jZzp);
                            }
                            jZzn = zzhVar22.zzn();
                            if (jZzn == 0) {
                                zzicVar2.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVar2.zzy(jZzp);
                            }
                            strZzh = zzhVar22.zzh();
                            zzqu.zza();
                            if (zzibVar2.zzc().zzp(str2, zzfx.zzaM) && strZzh != null) {
                                zzicVar2.zzau(strZzh);
                            }
                            zzhVar22.zzL();
                            zzicVar2.zzZ((int) zzhVar22.zzG());
                            zzibVar2.zzc().zzi();
                            zzicVar2.zzO(130000L);
                            zzicVar2.zzs(zzibVar2.zzaZ().currentTimeMillis());
                            zzicVar2.zzae(z32);
                            zzpfVar62.zzS(zzicVar2.zzK(), zzicVar2);
                            zzhzVar.zze(zzicVar2);
                            zzhVar22.zzo(zzicVar2.zzu());
                            zzhVar22.zzq(zzicVar2.zzw());
                            zzpfVar2.zzj().zzv(zzhVar22, false, false);
                            zzpfVar2.zzj().zzc();
                            zzpfVar2.zzj().zzd();
                            try {
                                return zzpfVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e3) {
                                zzloVarZzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgt.zzl(str2), e3);
                                return obj;
                            }
                        } catch (SecurityException e4) {
                            zzloVarZzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e4.getMessage());
                            bArr = new byte[0];
                            zzpfVar = zzloVarZzn.zzg;
                        }
                    }
                    zzpfVar.zzj().zzd();
                    return bArr;
                }
                zzloVarZzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzpfVar4.zzj().zzd();
            return bArr2;
        } catch (Throwable th) {
            zzloVarZzn.zzg.zzj().zzd();
            throw th;
        }
    }
}
