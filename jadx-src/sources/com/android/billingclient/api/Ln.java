package com.android.billingclient.api;

import com.android.billingclient.api.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class Ln {
    static final Ml E2;
    static final Ml HI;
    static final Ml Ik;
    static final Ml J2;
    static final Ml KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final Ml f47540O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final Ml f47541S;
    static final Ml Uo;
    static final Ml ViF;
    static final Ml WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final Ml f47542X;
    static final Ml XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final Ml f47543Z;
    static final Ml aYN;
    static final Ml az;
    static final Ml ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Ml f47544e;
    static final Ml fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Ml f47545g;
    static final Ml gh;
    static final Ml iF;
    static final Ml mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Ml f47546n;
    static final Ml nY;
    static final Ml nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Ml f47547o;
    static final Ml qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Ml f47548r;
    static final Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Ml f47549t;
    static final Ml te;
    static final Ml ty;
    static final Ml xMQ;

    static {
        Ml.j jVarT = Ml.t();
        jVarT.t(3);
        jVarT.rl("Google Play In-app Billing API version is less than 3");
        f47546n = jVarT.n();
        Ml.j jVarT2 = Ml.t();
        jVarT2.t(3);
        jVarT2.rl("Google Play In-app Billing API version is less than 9");
        rl = jVarT2.n();
        Ml.j jVarT3 = Ml.t();
        jVarT3.t(3);
        jVarT3.rl("Billing service unavailable on device.");
        f47549t = jVarT3.n();
        Ml.j jVarT4 = Ml.t();
        jVarT4.t(2);
        jVarT4.rl("Billing service unavailable on device.");
        nr = jVarT4.n();
        Ml.j jVarT5 = Ml.t();
        jVarT5.t(5);
        jVarT5.rl("Client is already in the process of connecting to billing service.");
        f47540O = jVarT5.n();
        Ml.j jVarT6 = Ml.t();
        jVarT6.t(5);
        jVarT6.rl("The list of SKUs can't be empty.");
        J2 = jVarT6.n();
        Ml.j jVarT7 = Ml.t();
        jVarT7.t(5);
        jVarT7.rl("SKU type can't be empty.");
        Uo = jVarT7.n();
        Ml.j jVarT8 = Ml.t();
        jVarT8.t(5);
        jVarT8.rl("Product type can't be empty.");
        KN = jVarT8.n();
        Ml.j jVarT9 = Ml.t();
        jVarT9.t(-2);
        jVarT9.rl("Client does not support extra params.");
        xMQ = jVarT9.n();
        Ml.j jVarT10 = Ml.t();
        jVarT10.t(5);
        jVarT10.rl("Invalid purchase token.");
        mUb = jVarT10.n();
        Ml.j jVarT11 = Ml.t();
        jVarT11.t(6);
        jVarT11.rl("An internal error occurred.");
        gh = jVarT11.n();
        Ml.j jVarT12 = Ml.t();
        jVarT12.t(5);
        jVarT12.rl("SKU can't be null.");
        jVarT12.n();
        Ml.j jVarT13 = Ml.t();
        jVarT13.t(0);
        qie = jVarT13.n();
        Ml.j jVarT14 = Ml.t();
        jVarT14.t(-1);
        jVarT14.rl("Service connection is disconnected.");
        az = jVarT14.n();
        Ml.j jVarT15 = Ml.t();
        jVarT15.t(2);
        jVarT15.rl("Timeout communicating with service.");
        ty = jVarT15.n();
        Ml.j jVarT16 = Ml.t();
        jVarT16.t(-2);
        jVarT16.rl("Client does not support subscriptions.");
        HI = jVarT16.n();
        Ml.j jVarT17 = Ml.t();
        jVarT17.t(-2);
        jVarT17.rl("Client does not support subscriptions update.");
        ck = jVarT17.n();
        Ml.j jVarT18 = Ml.t();
        jVarT18.t(-2);
        jVarT18.rl("Client does not support get purchase history.");
        Ik = jVarT18.n();
        Ml.j jVarT19 = Ml.t();
        jVarT19.t(-2);
        jVarT19.rl("Client does not support price change confirmation.");
        f47548r = jVarT19.n();
        Ml.j jVarT20 = Ml.t();
        jVarT20.t(-2);
        jVarT20.rl("Play Store version installed does not support cross selling products.");
        f47547o = jVarT20.n();
        Ml.j jVarT21 = Ml.t();
        jVarT21.t(-2);
        jVarT21.rl("Client does not support multi-item purchases.");
        f47543Z = jVarT21.n();
        Ml.j jVarT22 = Ml.t();
        jVarT22.t(-2);
        jVarT22.rl("Client does not support offer_id_token.");
        XQ = jVarT22.n();
        Ml.j jVarT23 = Ml.t();
        jVarT23.t(-2);
        jVarT23.rl("Client does not support ProductDetails.");
        f47541S = jVarT23.n();
        Ml.j jVarT24 = Ml.t();
        jVarT24.t(-2);
        jVarT24.rl("Client does not support in-app messages.");
        WPU = jVarT24.n();
        Ml.j jVarT25 = Ml.t();
        jVarT25.t(-2);
        jVarT25.rl("Client does not support user choice billing.");
        jVarT25.n();
        Ml.j jVarT26 = Ml.t();
        jVarT26.t(-2);
        jVarT26.rl("Play Store version installed does not support external offer.");
        aYN = jVarT26.n();
        Ml.j jVarT27 = Ml.t();
        jVarT27.t(-2);
        jVarT27.rl("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        ViF = jVarT27.n();
        Ml.j jVarT28 = Ml.t();
        jVarT28.t(5);
        jVarT28.rl("Unknown feature");
        nY = jVarT28.n();
        Ml.j jVarT29 = Ml.t();
        jVarT29.t(-2);
        jVarT29.rl("Play Store version installed does not support get billing config.");
        f47545g = jVarT29.n();
        Ml.j jVarT30 = Ml.t();
        jVarT30.t(-2);
        jVarT30.rl("Query product details with serialized docid is not supported.");
        te = jVarT30.n();
        Ml.j jVarT31 = Ml.t();
        jVarT31.t(4);
        jVarT31.rl("Item is unavailable for purchase.");
        iF = jVarT31.n();
        Ml.j jVarT32 = Ml.t();
        jVarT32.t(-2);
        jVarT32.rl("Query product details with developer specified account is not supported.");
        fD = jVarT32.n();
        Ml.j jVarT33 = Ml.t();
        jVarT33.t(-2);
        jVarT33.rl("Play Store version installed does not support alternative billing only.");
        E2 = jVarT33.n();
        Ml.j jVarT34 = Ml.t();
        jVarT34.t(5);
        jVarT34.rl("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f47544e = jVarT34.n();
        Ml.j jVarT35 = Ml.t();
        jVarT35.t(6);
        jVarT35.rl("An error occurred while retrieving billing override.");
        f47542X = jVarT35.n();
    }

    static Ml n(int i2, String str) {
        Ml.j jVarT = Ml.t();
        jVarT.t(i2);
        jVarT.rl(str);
        return jVarT.n();
    }
}
