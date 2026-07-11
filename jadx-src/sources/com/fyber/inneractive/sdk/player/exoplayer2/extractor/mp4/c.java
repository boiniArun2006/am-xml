package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ep.oxM.esLNYym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class c {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final int f55133H0;
    public static final int I0;
    public static final int J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final int f55137K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f55166l0;
    public static final int m0;
    public static final int n0;
    public static final int o0;
    public static final int p0;
    public static final int q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f55173r0;
    public static final int s0;
    public static final int t0;
    public static final int u0;
    public static final int v0;
    public static final int w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f55180x0;
    public static final int y0;
    public static final int z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55153b = z.a("ftyp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55154c = z.a("avc1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55156d = z.a("avc3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55157e = z.a("hvc1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55158f = z.a("hev1");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55159g = z.a(esLNYym.pOOyfphlnq);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55161h = z.a("d263");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55162i = z.a("mdat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55163j = z.a("mp4a");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f55164k = z.a(".mp3");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f55165l = z.a("wave");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55167m = z.a("lpcm");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55168n = z.a("sowt");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55169o = z.a("ac-3");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f55170p = z.a("dac3");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f55171q = z.a("ec-3");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f55172r = z.a("dec3");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f55174s = z.a("dtsc");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f55175t = z.a("dtsh");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f55176u = z.a("dtsl");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f55177v = z.a("dtse");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f55178w = z.a("ddts");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f55179x = z.a("tfdt");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f55181y = z.a("tfhd");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f55182z = z.a("trex");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f55125A = z.a("trun");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f55126B = z.a("sidx");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f55127C = z.a("moov");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f55128D = z.a("mvhd");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f55129E = z.a("trak");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f55130F = z.a("mdia");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f55131G = z.a("minf");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f55132H = z.a("stbl");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f55134I = z.a("avcC");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f55135J = z.a("hvcC");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f55136K = z.a("esds");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f55138L = z.a("moof");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f55139M = z.a("traf");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f55140N = z.a("mvex");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f55141O = z.a("mehd");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f55142P = z.a("tkhd");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f55143Q = z.a("edts");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f55144R = z.a("elst");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f55145S = z.a("mdhd");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f55146T = z.a("hdlr");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f55147U = z.a("stsd");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f55148V = z.a("pssh");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f55149W = z.a("sinf");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f55150X = z.a("schm");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f55151Y = z.a("schi");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f55152Z = z.a("tenc");
    public static final int a0 = z.a("encv");
    public static final int b0 = z.a("enca");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f55155c0 = z.a("frma");
    public static final int d0 = z.a("saiz");
    public static final int e0 = z.a("saio");
    public static final int f0 = z.a("sbgp");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f55160g0 = z.a("sgpd");
    public static final int h0 = z.a(gUxOLwRQBPPLC.GHPsVdckguH);
    public static final int i0 = z.a("senc");
    public static final int j0 = z.a("pasp");
    public static final int k0 = z.a("TTML");

    static {
        z.a("vmhd");
        f55166l0 = z.a("mp4v");
        m0 = z.a("stts");
        n0 = z.a("stss");
        o0 = z.a("ctts");
        p0 = z.a("stsc");
        q0 = z.a("stsz");
        f55173r0 = z.a("stz2");
        s0 = z.a("stco");
        t0 = z.a("co64");
        u0 = z.a("tx3g");
        v0 = z.a("wvtt");
        w0 = z.a("stpp");
        f55180x0 = z.a("c608");
        y0 = z.a("samr");
        z0 = z.a("sawb");
        A0 = z.a("udta");
        B0 = z.a("meta");
        C0 = z.a("ilst");
        D0 = z.a("mean");
        E0 = z.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
        F0 = z.a("data");
        G0 = z.a("emsg");
        f55133H0 = z.a("st3d");
        I0 = z.a("sv3d");
        J0 = z.a("proj");
        f55137K0 = z.a("vp08");
        L0 = z.a("vp09");
        M0 = z.a("vpcC");
        N0 = z.a("camm");
        O0 = z.a("alac");
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public String toString() {
        return a(this.f55183a);
    }

    public c(int i2) {
        this.f55183a = i2;
    }
}
