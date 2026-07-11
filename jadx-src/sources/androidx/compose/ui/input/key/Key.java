package androidx.compose.ui.input.key;

import androidx.media3.extractor.ts.TsExtractor;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/key/Key;", "", "", "keyCode", "ck", "(J)J", "", "Z", "(J)Ljava/lang/String;", "", "o", "(J)I", InneractiveMediationNameConsts.OTHER, "", "Ik", "(JLjava/lang/Object;)Z", c.f62177j, "J", "getKeyCode", "()J", "rl", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Key {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long keyCode;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f32007t = Key_androidKt.n(0);
    private static final long nr = Key_androidKt.n(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f31976O = Key_androidKt.n(2);
    private static final long J2 = Key_androidKt.n(3);
    private static final long Uo = Key_androidKt.n(4);
    private static final long KN = Key_androidKt.n(259);
    private static final long xMQ = Key_androidKt.n(260);
    private static final long mUb = Key_androidKt.n(261);
    private static final long gh = Key_androidKt.n(262);
    private static final long qie = Key_androidKt.n(263);
    private static final long az = Key_androidKt.n(280);
    private static final long ty = Key_androidKt.n(281);
    private static final long HI = Key_androidKt.n(282);
    private static final long ck = Key_androidKt.n(283);
    private static final long Ik = Key_androidKt.n(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f32005r = Key_androidKt.n(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f32002o = Key_androidKt.n(19);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f31985Z = Key_androidKt.n(20);
    private static final long XQ = Key_androidKt.n(21);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final long f31979S = Key_androidKt.n(22);
    private static final long WPU = Key_androidKt.n(23);
    private static final long aYN = Key_androidKt.n(268);
    private static final long ViF = Key_androidKt.n(269);
    private static final long nY = Key_androidKt.n(270);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f31995g = Key_androidKt.n(271);
    private static final long te = Key_androidKt.n(24);
    private static final long iF = Key_androidKt.n(25);
    private static final long fD = Key_androidKt.n(26);
    private static final long E2 = Key_androidKt.n(27);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f31991e = Key_androidKt.n(28);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final long f31983X = Key_androidKt.n(7);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final long f31980T = Key_androidKt.n(8);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final long f31974N = Key_androidKt.n(9);
    private static final long nHg = Key_androidKt.n(10);
    private static final long s7N = Key_androidKt.n(11);
    private static final long wTp = Key_androidKt.n(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f32008v = Key_androidKt.n(13);
    private static final long rV9 = Key_androidKt.n(14);
    private static final long bzg = Key_androidKt.n(15);
    private static final long Xw = Key_androidKt.n(16);
    private static final long jB = Key_androidKt.n(81);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final long f31981U = Key_androidKt.n(69);
    private static final long P5 = Key_androidKt.n(17);
    private static final long M7 = Key_androidKt.n(70);
    private static final long p5 = Key_androidKt.n(18);
    private static final long eF = Key_androidKt.n(29);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final long f31962E = Key_androidKt.n(30);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final long f31973M = Key_androidKt.n(31);

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final long f31964FX = Key_androidKt.n(32);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final long f31958B = Key_androidKt.n(33);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final long f31970J = Key_androidKt.n(34);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final long f31961D = Key_androidKt.n(35);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f31986a = Key_androidKt.n(36);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final long f31969I = Key_androidKt.n(37);

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final long f31967GR = Key_androidKt.n(38);
    private static final long Nxk = Key_androidKt.n(39);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final long f31984Y = Key_androidKt.n(40);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f31999k = Key_androidKt.n(41);
    private static final long dR0 = Key_androidKt.n(42);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f32012z = Key_androidKt.n(43);
    private static final long piY = Key_androidKt.n(44);
    private static final long ijL = Key_androidKt.n(45);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f32001m = Key_androidKt.n(46);
    private static final long eTf = Key_androidKt.n(47);
    private static final long xg = Key_androidKt.n(48);
    private static final long pJg = Key_androidKt.n(49);
    private static final long ofS = Key_androidKt.n(50);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final long f31959C = Key_androidKt.n(51);
    private static final long Mx = Key_androidKt.n(52);

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final long f31966G7 = Key_androidKt.n(53);
    private static final long fcU = Key_androidKt.n(54);
    private static final long eWT = Key_androidKt.n(55);
    private static final long ul = Key_androidKt.n(56);
    private static final long n1 = Key_androidKt.n(57);
    private static final long Jk = Key_androidKt.n(58);
    private static final long Rl = Key_androidKt.n(59);
    private static final long qm = Key_androidKt.n(60);
    private static final long mYa = Key_androidKt.n(61);
    private static final long Org = Key_androidKt.n(62);
    private static final long HV = Key_androidKt.n(63);
    private static final long GD = Key_androidKt.n(64);
    private static final long Po6 = Key_androidKt.n(65);
    private static final long EWS = Key_androidKt.n(66);
    private static final long hRu = Key_androidKt.n(67);
    private static final long UhV = Key_androidKt.n(112);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f31997i = Key_androidKt.n(111);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final long f31971K = Key_androidKt.n(113);
    private static final long How = Key_androidKt.n(114);
    private static final long tUK = Key_androidKt.n(115);
    private static final long ER = Key_androidKt.n(116);
    private static final long lLA = Key_androidKt.n(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
    private static final long kSg = Key_androidKt.n(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final long f31982W = Key_androidKt.n(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
    private static final long RQ = Key_androidKt.n(b.f61769v);
    private static final long a63 = Key_androidKt.n(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final long f31963F = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
    private static final long QZ6 = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
    private static final long tFV = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    private static final long VwL = Key_androidKt.n(277);
    private static final long mI = Key_androidKt.n(278);
    private static final long T3L = Key_androidKt.n(279);
    private static final long Bu = Key_androidKt.n(68);
    private static final long p0N = Key_androidKt.n(71);
    private static final long Uf = Key_androidKt.n(72);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f31994f = Key_androidKt.n(76);
    private static final long ub = Key_androidKt.n(73);
    private static final long Qu = Key_androidKt.n(74);
    private static final long HBN = Key_androidKt.n(75);
    private static final long UF = Key_androidKt.n(77);
    private static final long X4T = Key_androidKt.n(78);
    private static final long Zmq = Key_androidKt.n(79);
    private static final long JVN = Key_androidKt.n(80);
    private static final long xVH = Key_androidKt.n(82);
    private static final long EF = Key_androidKt.n(83);
    private static final long uG = Key_androidKt.n(84);
    private static final long Vvq = Key_androidKt.n(92);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f32011y = Key_androidKt.n(93);
    private static final long Zn = Key_androidKt.n(94);
    private static final long nO = Key_androidKt.n(95);
    private static final long vl = Key_androidKt.n(96);
    private static final long v0j = Key_androidKt.n(97);
    private static final long o9 = Key_androidKt.n(98);
    private static final long n7b = Key_androidKt.n(99);
    private static final long Aum = Key_androidKt.n(100);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f32006s = Key_androidKt.n(101);
    private static final long Lp6 = Key_androidKt.n(102);
    private static final long g6 = Key_androidKt.n(103);
    private static final long Mh = Key_androidKt.n(104);
    private static final long jO = Key_androidKt.n(105);
    private static final long Toy = Key_androidKt.n(106);
    private static final long wKp = Key_androidKt.n(107);
    private static final long Th = Key_androidKt.n(108);
    private static final long xzo = Key_androidKt.n(109);
    private static final long XNZ = Key_androidKt.n(110);
    private static final long lNy = Key_androidKt.n(188);
    private static final long I9f = Key_androidKt.n(189);
    private static final long D76 = Key_androidKt.n(190);

    /* JADX INFO: renamed from: NP, reason: collision with root package name */
    private static final long f31975NP = Key_androidKt.n(191);
    private static final long QgZ = Key_androidKt.n(192);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f31998j = Key_androidKt.n(193);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final long f31968H = Key_androidKt.n(194);
    private static final long waP = Key_androidKt.n(195);
    private static final long LPV = Key_androidKt.n(196);
    private static final long rxp = Key_androidKt.n(197);
    private static final long Fp = Key_androidKt.n(198);
    private static final long Ro = Key_androidKt.n(199);
    private static final long SR = Key_androidKt.n(200);
    private static final long EN = Key_androidKt.n(201);
    private static final long pS = Key_androidKt.n(Sdk.SDKError.Reason.AD_CONSUMED_VALUE);
    private static final long tEO = Key_androidKt.n(Sdk.SDKError.Reason.AD_IS_LOADING_VALUE);
    private static final long yAc = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f31996h = Key_androidKt.n(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f32000l = Key_androidKt.n(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

    /* JADX INFO: renamed from: eo, reason: collision with root package name */
    private static final long f31992eo = Key_androidKt.n(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
    private static final long uQ = Key_androidKt.n(134);
    private static final long wKY = Key_androidKt.n(135);
    private static final long mx = Key_androidKt.n(136);
    private static final long lS = Key_androidKt.n(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
    private static final long iV = Key_androidKt.n(138);
    private static final long I4p = Key_androidKt.n(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
    private static final long bZm = Key_androidKt.n(140);
    private static final long Co = Key_androidKt.n(141);
    private static final long q9 = Key_androidKt.n(142);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final long f31957A = Key_androidKt.n(143);
    private static final long WH = Key_androidKt.n(144);
    private static final long oz = Key_androidKt.n(145);
    private static final long qva = Key_androidKt.n(146);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f31990d = Key_androidKt.n(147);
    private static final long rT = Key_androidKt.n(148);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final long f31972L = Key_androidKt.n(149);
    private static final long Lu = Key_androidKt.n(150);
    private static final long HE = Key_androidKt.n(151);
    private static final long fW = Key_androidKt.n(ModuleDescriptor.MODULE_VERSION);
    private static final long c32 = Key_androidKt.n(153);
    private static final long l2 = Key_androidKt.n(154);
    private static final long Om = Key_androidKt.n(155);
    private static final long t1J = Key_androidKt.n(156);
    private static final long GH3 = Key_androidKt.n(157);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f32009w = Key_androidKt.n(158);
    private static final long HFS = Key_androidKt.n(159);
    private static final long eb = Key_androidKt.n(160);
    private static final long Xli = Key_androidKt.n(161);
    private static final long fq = Key_androidKt.n(162);
    private static final long C7B = Key_androidKt.n(163);
    private static final long wYi = Key_androidKt.n(126);
    private static final long TVk = Key_androidKt.n(127);
    private static final long lRt = Key_androidKt.n(85);
    private static final long n7u = Key_androidKt.n(86);
    private static final long yA = Key_androidKt.n(130);
    private static final long gxH = Key_androidKt.n(87);
    private static final long YiW = Key_androidKt.n(88);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f31988c = Key_androidKt.n(89);
    private static final long Sax = Key_androidKt.n(90);
    private static final long kQ = Key_androidKt.n(128);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f32010x = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
    private static final long XUb = Key_androidKt.n(129);
    private static final long rR = Key_androidKt.n(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    private static final long MPw = Key_androidKt.n(272);
    private static final long V5F = Key_androidKt.n(273);
    private static final long sFO = Key_androidKt.n(274);
    private static final long JI = Key_androidKt.n(275);
    private static final long Of6 = Key_androidKt.n(91);
    private static final long jX = Key_androidKt.n(164);
    private static final long iu = Key_androidKt.n(165);
    private static final long Qg8 = Key_androidKt.n(166);
    private static final long tdZ = Key_androidKt.n(167);
    private static final long GRh = Key_androidKt.n(168);

    /* JADX INFO: renamed from: Rc, reason: collision with root package name */
    private static final long f31978Rc = Key_androidKt.n(169);
    private static final long UR = Key_androidKt.n(170);
    private static final long W5k = Key_androidKt.n(171);
    private static final long NC9 = Key_androidKt.n(172);
    private static final long ex = Key_androidKt.n(173);
    private static final long poH = Key_androidKt.n(174);
    private static final long W1c = Key_androidKt.n(175);
    private static final long pr = Key_androidKt.n(176);
    private static final long ni = Key_androidKt.n(177);
    private static final long GT = Key_androidKt.n(178);
    private static final long Vd = Key_androidKt.n(179);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f31987b = Key_androidKt.n(180);
    private static final long WKb = Key_androidKt.n(181);
    private static final long ZwA = Key_androidKt.n(182);
    private static final long jE = Key_androidKt.n(183);
    private static final long kC = Key_androidKt.n(184);
    private static final long eOa = Key_androidKt.n(185);
    private static final long i7 = Key_androidKt.n(186);
    private static final long VK2 = Key_androidKt.n(187);
    private static final long R3E = Key_androidKt.n(204);
    private static final long Yq = Key_androidKt.n(Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final long f31965G = Key_androidKt.n(Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE);
    private static final long f11 = Key_androidKt.n(Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE);
    private static final long cAB = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
    private static final long kR = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE);
    private static final long yUZ = Key_androidKt.n(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);
    private static final long Bha = Key_androidKt.n(211);
    private static final long H6M = Key_androidKt.n(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
    private static final long YE = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
    private static final long hu = Key_androidKt.n(Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
    private static final long ENe = Key_androidKt.n(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
    private static final long Ai = Key_androidKt.n(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
    private static final long lvn = Key_androidKt.n(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
    private static final long F6W = Key_androidKt.n(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
    private static final long u2n = Key_androidKt.n(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f32004q = Key_androidKt.n(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
    private static final long Hq = Key_androidKt.n(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f32003p = Key_androidKt.n(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);

    /* JADX INFO: renamed from: ep, reason: collision with root package name */
    private static final long f31993ep = Key_androidKt.n(224);
    private static final long X6 = Key_androidKt.n(276);
    private static final long fwz = Key_androidKt.n(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final long f31977Q = Key_androidKt.n(229);
    private static final long sYH = Key_androidKt.n(230);
    private static final long c2 = Key_androidKt.n(231);
    private static final long eF0 = Key_androidKt.n(232);
    private static final long DtL = Key_androidKt.n(233);
    private static final long Pzf = Key_androidKt.n(234);
    private static final long NQ2 = Key_androidKt.n(235);
    private static final long aJ = Key_androidKt.n(236);
    private static final long taU = Key_androidKt.n(237);
    private static final long pt = Key_androidKt.n(238);
    private static final long Rf = Key_androidKt.n(239);
    private static final long vMk = Key_androidKt.n(240);
    private static final long z51 = Key_androidKt.n(241);
    private static final long tzr = Key_androidKt.n(242);
    private static final long q8 = Key_androidKt.n(243);
    private static final long cJ = Key_androidKt.n(244);
    private static final long zv = Key_androidKt.n(245);

    /* JADX INFO: renamed from: CU, reason: collision with root package name */
    private static final long f31960CU = Key_androidKt.n(246);
    private static final long Ep = Key_androidKt.n(247);
    private static final long GHt = Key_androidKt.n(248);
    private static final long WT = Key_androidKt.n(249);

    /* JADX INFO: renamed from: cB, reason: collision with root package name */
    private static final long f31989cB = Key_androidKt.n(250);
    private static final long ZZU = Key_androidKt.n(251);
    private static final long rqO = Key_androidKt.n(252);
    private static final long x8 = Key_androidKt.n(253);
    private static final long xJ = Key_androidKt.n(254);
    private static final long zB = Key_androidKt.n(255);
    private static final long g7 = Key_androidKt.n(256);
    private static final long pE = Key_androidKt.n(257);
    private static final long GN = Key_androidKt.n(258);
    private static final long xSy = Key_androidKt.n(264);
    private static final long kW = Key_androidKt.n(265);
    private static final long NUo = Key_androidKt.n(266);
    private static final long stS = Key_androidKt.n(267);
    private static final long VmZ = Key_androidKt.n(284);
    private static final long Mfw = Key_androidKt.n(285);
    private static final long Tuk = Key_androidKt.n(286);
    private static final long lH = Key_androidKt.n(l.f62282d);
    private static final long Pn = Key_androidKt.n(288);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/key/Key$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/Key;", "Back", "J", c.f62177j, "()J", "DirectionUp", "J2", "DirectionDown", "t", "DirectionLeft", "nr", "DirectionRight", "O", "DirectionCenter", "rl", "Tab", "HI", "Spacebar", "ty", "Enter", "Uo", "Escape", "KN", "MoveHome", "mUb", "MoveEnd", "xMQ", "PageUp", "az", "PageDown", "qie", "NumPadEnter", "gh", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long HI() {
            return Key.mYa;
        }

        public final long J2() {
            return Key.f32002o;
        }

        public final long KN() {
            return Key.f31997i;
        }

        public final long O() {
            return Key.f31979S;
        }

        public final long Uo() {
            return Key.EWS;
        }

        public final long az() {
            return Key.Vvq;
        }

        public final long gh() {
            return Key.eb;
        }

        public final long mUb() {
            return Key.f31963F;
        }

        public final long n() {
            return Key.Uo;
        }

        public final long nr() {
            return Key.XQ;
        }

        public final long qie() {
            return Key.f32011y;
        }

        public final long rl() {
            return Key.WPU;
        }

        public final long t() {
            return Key.f31985Z;
        }

        public final long ty() {
            return Key.Org;
        }

        public final long xMQ() {
            return Key.QZ6;
        }
    }

    public static boolean Ik(long j2, Object obj) {
        return (obj instanceof Key) && j2 == ((Key) obj).getKeyCode();
    }

    public static long ck(long j2) {
        return j2;
    }

    public static int o(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean r(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final /* synthetic */ long getKeyCode() {
        return this.keyCode;
    }

    public boolean equals(Object obj) {
        return Ik(this.keyCode, obj);
    }

    public int hashCode() {
        return o(this.keyCode);
    }

    public static String Z(long j2) {
        return "Key code: " + j2;
    }

    public String toString() {
        return Z(this.keyCode);
    }
}
