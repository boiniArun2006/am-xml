package tu;

import GJW.OU;
import GJW.vd;
import LQ.j;
import MoG.eO;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.AlightMotionApplication;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import tu.Ml;
import tu.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f74019n = new LinkedHashSet();
    private static final Map rl = new LinkedHashMap();

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74020n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f74021t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f74021t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f74021t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74020n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AlightMotionApplication alightMotionApplicationRl = IvA.n.rl();
            Uri uri = this.f74021t;
            this.f74020n = 1;
            Object objN = Kp.n.n(alightMotionApplicationRl, uri, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ Map J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74022O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74023n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ HI0.Q f74024o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Uri f74025r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74026t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HI0.UGc.values().length];
                try {
                    iArr[HI0.UGc.f3841n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HI0.UGc.f3843t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Map map, Uri uri, HI0.Q q2, Continuation continuation) {
            super(2, continuation);
            this.J2 = map;
            this.f74025r = uri;
            this.f74024o = q2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.J2, this.f74025r, this.f74024o, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map map;
            Object obj2;
            Uri uri;
            int i2;
            Boolean boolBoxBoolean;
            Boolean boolBoxBoolean2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f74022O;
            if (i3 != 0) {
                if (i3 == 1) {
                    uri = (Uri) this.f74026t;
                    map = (Map) this.f74023n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                map = this.J2;
                Uri uri2 = this.f74025r;
                HI0.Q q2 = this.f74024o;
                obj2 = map.get(uri2);
                if (obj2 == null) {
                    this.f74023n = map;
                    this.f74026t = uri2;
                    this.f74022O = 1;
                    Object objN = HI0.r.n(q2, uri2, this);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uri = uri2;
                    obj = objN;
                }
                i2 = j.$EnumSwitchMapping$0[((HI0.UGc) obj2).ordinal()];
                if (i2 != 1) {
                    Set set = r.f74019n;
                    Uri uri3 = this.f74025r;
                    synchronized (set) {
                        boolBoxBoolean = Boxing.boxBoolean(r.f74019n.remove(uri3));
                    }
                    return boolBoxBoolean;
                }
                if (i2 == 2) {
                    Set set2 = r.f74019n;
                    Uri uri4 = this.f74025r;
                    synchronized (set2) {
                        boolBoxBoolean2 = Boxing.boxBoolean(r.f74019n.add(uri4));
                    }
                    return boolBoxBoolean2;
                }
                return Unit.INSTANCE;
            }
            obj2 = (HI0.UGc) obj;
            map.put(uri, obj2);
            i2 = j.$EnumSwitchMapping$0[((HI0.UGc) obj2).ordinal()];
            if (i2 != 1) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ViF(long j2, long j3) {
        return j3 - j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long WPU(long j2, long j3) {
        return j3 - j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long aYN(long j2, long j3) {
        return j3 - j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x05a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187  */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124, types: [androidx.exifinterface.media.ExifInterface] */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r13v12, types: [tu.DAz] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [tu.Ml] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v5, types: [T, tu.u] */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r43v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r98v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r98v11 */
    /* JADX WARN: Type inference failed for: r98v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SPz o(Uri uri, HI0.Q q2, boolean z2) {
        long j2;
        String string;
        String filename;
        String string2;
        MediaExtractor mediaExtractor;
        int i2;
        Throwable th;
        Throwable th2;
        AssetFileDescriptor assetFileDescriptor;
        Throwable th3;
        Ref.LongRef longRef;
        int i3;
        ArrayList arrayList;
        ?? r98;
        int i5;
        MediaExtractor mediaExtractor2;
        int i7;
        long j3;
        long j4;
        int i8;
        String strKN;
        u uVarRl;
        long jLongValue;
        long jLongValue2;
        Long longOrNull;
        boolean z3;
        MediaExtractor mediaExtractor3;
        String str;
        boolean z4;
        String strXMQ;
        String str2;
        ?? r02;
        Ml ml;
        String strXMQ2;
        String str3;
        String str4;
        ?? r40;
        String str5;
        ?? r03;
        u.j[] jVarArrValues;
        int length;
        int i9;
        u.j jVar;
        String strXMQ3;
        String strRemovePrefix;
        String str6;
        ?? uVar;
        u.j[] jVarArr;
        Integer intOrNull;
        ?? r04;
        String str7;
        String str8;
        int iUo;
        String strJ2;
        AssetFileDescriptor assetFileDescriptorNr;
        long jNanoTime = System.nanoTime();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        MediaExtractor mediaExtractor4 = new MediaExtractor();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr = new byte[1024];
        try {
            AssetFileDescriptor assetFileDescriptorNr2 = q2.nr(uri, "r");
            try {
                long length2 = assetFileDescriptorNr2.getLength();
                CloseableKt.closeFinally(assetFileDescriptorNr2, null);
                Set set = f74019n;
                synchronized (set) {
                    set.remove(uri);
                }
                MediaUriInfo mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
                if (mediaUriInfoFromCache != null) {
                    String title = mediaUriInfoFromCache.getTitle();
                    filename = mediaUriInfoFromCache.getFilename();
                    j2 = jNanoTime;
                    string = title;
                } else {
                    j2 = jNanoTime;
                    Cursor cursorJ2 = q2.J2(uri, null, null, null, null);
                    if (cursorJ2 != null) {
                        int columnIndex = cursorJ2.getColumnIndex("_display_name");
                        int columnIndex2 = cursorJ2.getColumnIndex("_data");
                        cursorJ2.moveToFirst();
                        string = cursorJ2.getString(columnIndex);
                        String name = (columnIndex2 >= 0 && (string2 = cursorJ2.getString(columnIndex2)) != null) ? new File(string2).getName() : null;
                        cursorJ2.close();
                        filename = name;
                    } else {
                        string = null;
                        filename = null;
                    }
                }
                if (string == null || StringsKt.isBlank(string)) {
                    string = uri.getLastPathSegment();
                }
                AssetFileDescriptor assetFileDescriptorNr3 = q2.nr(uri, "r");
                try {
                    FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorNr3.getFileDescriptor());
                    try {
                        fileInputStream.skip(assetFileDescriptorNr3.getStartOffset());
                        int i10 = 0;
                        SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArr, 0, fileInputStream.read(bArr)), fileInputStream);
                        try {
                            BitmapFactory.decodeStream(sequenceInputStream, null, options);
                            CloseableKt.closeFinally(sequenceInputStream, null);
                            CloseableKt.closeFinally(fileInputStream, null);
                            CloseableKt.closeFinally(assetFileDescriptorNr3, null);
                            CN3 cn3N = fuX.n(bArr);
                            if (options.outWidth <= 0 || options.outHeight <= 0) {
                                AssetFileDescriptor assetFileDescriptorNr4 = q2.nr(uri, "r");
                                try {
                                    try {
                                        th = null;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        assetFileDescriptor = assetFileDescriptorNr4;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    mediaExtractor = mediaExtractor4;
                                    i2 = 0;
                                    th = null;
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    mediaExtractor = mediaExtractor4;
                                    i2 = 0;
                                    th = null;
                                } catch (RuntimeException e4) {
                                    e = e4;
                                    mediaExtractor = mediaExtractor4;
                                    i2 = 0;
                                    th = null;
                                }
                                try {
                                    try {
                                        i2 = 0;
                                        try {
                                            mediaExtractor4.setDataSource(assetFileDescriptorNr4.getFileDescriptor(), assetFileDescriptorNr4.getStartOffset(), assetFileDescriptorNr4.getLength());
                                            try {
                                                try {
                                                    try {
                                                        mediaExtractor = mediaExtractor4;
                                                        try {
                                                            mediaMetadataRetriever.setDataSource(assetFileDescriptorNr4.getFileDescriptor(), assetFileDescriptorNr4.getStartOffset(), assetFileDescriptorNr4.getLength());
                                                            th3 = null;
                                                        } catch (IOException e5) {
                                                            e = e5;
                                                            th3 = e;
                                                        } catch (IllegalArgumentException e6) {
                                                            e = e6;
                                                            th3 = e;
                                                        } catch (RuntimeException e7) {
                                                            e = e7;
                                                            th3 = e;
                                                        }
                                                    } catch (IOException | IllegalArgumentException | RuntimeException e8) {
                                                        e = e8;
                                                        mediaExtractor = mediaExtractor4;
                                                    }
                                                } catch (IOException | IllegalArgumentException | RuntimeException e9) {
                                                    e = e9;
                                                    mediaExtractor = mediaExtractor4;
                                                }
                                            } catch (IOException | IllegalArgumentException | RuntimeException e10) {
                                                e = e10;
                                                mediaExtractor = mediaExtractor4;
                                            }
                                        } catch (IOException | IllegalArgumentException | RuntimeException e11) {
                                            e = e11;
                                            mediaExtractor = mediaExtractor4;
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        i2 = 0;
                                        mediaExtractor = mediaExtractor4;
                                        th3 = e;
                                        if (th3 == null) {
                                        }
                                        th2 = th;
                                        throw th2;
                                    } catch (IllegalArgumentException e13) {
                                        e = e13;
                                        i2 = 0;
                                        mediaExtractor = mediaExtractor4;
                                        th3 = e;
                                        if (th3 == null) {
                                        }
                                        th2 = th;
                                        throw th2;
                                    } catch (RuntimeException e14) {
                                        e = e14;
                                        i2 = 0;
                                        mediaExtractor = mediaExtractor4;
                                        th3 = e;
                                        if (th3 == null) {
                                        }
                                        th2 = th;
                                        throw th2;
                                    }
                                    throw th2;
                                } catch (Throwable th5) {
                                    CloseableKt.closeFinally(assetFileDescriptor, th2);
                                    throw th5;
                                }
                                if (th3 == null) {
                                    try {
                                        try {
                                            aC aCVar = new aC(uri, "", 0L, null, null, null, 0, 0, 0, null, 0, length2, string, th3, System.nanoTime() - j2, true, filename);
                                            CloseableKt.closeFinally(assetFileDescriptorNr4, null);
                                            return aCVar;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            assetFileDescriptor = assetFileDescriptorNr4;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        assetFileDescriptor = assetFileDescriptorNr4;
                                    }
                                } else {
                                    assetFileDescriptor = assetFileDescriptorNr4;
                                    String str9 = string;
                                    Throwable th8 = th;
                                    try {
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(assetFileDescriptor, th8);
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                                        Object intOrNull2 = strExtractMetadata != null ? StringsKt.toIntOrNull(strExtractMetadata) : th8;
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                                        int iIntValue = (strExtractMetadata2 == null || (intOrNull = StringsKt.toIntOrNull(strExtractMetadata2)) == null) ? i2 : intOrNull.intValue();
                                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(12);
                                        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(7);
                                        int i11 = Build.VERSION.SDK_INT;
                                        final ?? string3 = i11 >= 26 ? mediaExtractor.getMetrics().getString("android.media.mediaextractor.fmt") : th8;
                                        final ?? string4 = i11 >= 26 ? mediaExtractor.getMetrics().getString("android.media.mediaextractor.mime") : th8;
                                        int i12 = i2;
                                        Throwable th9 = th8;
                                        ?? r24 = th9;
                                        int i13 = -1;
                                        int i14 = -1;
                                        ?? dAz = th9;
                                        ?? r14 = th8;
                                        for (Object obj : Hr.aC.HI(mediaExtractor)) {
                                            int i15 = i12 + 1;
                                            if (i12 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            MediaFormat mediaFormat = (MediaFormat) obj;
                                            String strXMQ4 = Hr.aC.xMQ(mediaFormat);
                                            if (strXMQ4 == null) {
                                                strXMQ4 = "";
                                            }
                                            String str10 = strExtractMetadata3;
                                            String str11 = strXMQ4;
                                            String str12 = strExtractMetadata4;
                                            String strSubstringBefore$default = StringsKt.substringBefore$default(str11, "/", (String) r14, 2, (Object) r14);
                                            int iHashCode = strSubstringBefore$default.hashCode();
                                            if (iHashCode != 3556653) {
                                                if (iHashCode == 93166550) {
                                                    mediaExtractor3 = mediaExtractor;
                                                    str = strExtractMetadata5;
                                                    if (strSubstringBefore$default.equals("audio")) {
                                                        if (r24 == 0 || !r24.Uo()) {
                                                            String strFindDecoderForFormat = Hr.aC.qie().findDecoderForFormat(mediaFormat);
                                                            if (strFindDecoderForFormat == null) {
                                                                strFindDecoderForFormat = Hr.CN3.t(Hr.aC.qie(), mediaFormat);
                                                            }
                                                            if (string4 != 0) {
                                                                str2 = strFindDecoderForFormat;
                                                                if (StringsKt.startsWith$default((String) string4, "audio", false, 2, (Object) null)) {
                                                                    r02 = string4;
                                                                }
                                                                boolean z5 = str2 == null;
                                                                int iTy = Hr.aC.ty(mediaFormat);
                                                                String str13 = str2 != null ? "" : str2;
                                                                int iT = Hr.aC.t(mediaFormat);
                                                                Integer numKN = Hr.aC.KN(mediaFormat);
                                                                Integer numMUb = Hr.aC.mUb(mediaFormat);
                                                                Ml.j jVar2 = (numMUb != null && numMUb.intValue() == 2) ? Ml.j.f73892n : (numMUb != null && numMUb.intValue() == 3) ? Ml.j.f73895t : (numMUb != null && numMUb.intValue() == 4) ? Ml.j.f73891O : Ml.j.J2;
                                                                strXMQ2 = Hr.aC.xMQ(mediaFormat);
                                                                if (strXMQ2 == null) {
                                                                    str3 = StringsKt.removePrefix((String) r02, (CharSequence) "audio/") + "audio";
                                                                    str4 = str3;
                                                                    ml = new Ml(z5, iTy, str13, r02, iT, numKN, jVar2, 0L, str4);
                                                                    if (ml.Uo()) {
                                                                        try {
                                                                            mediaExtractor3.selectTrack(i12);
                                                                            r40 = ml;
                                                                        } catch (IllegalArgumentException unused) {
                                                                            i12 = i13;
                                                                            r40 = 0;
                                                                        }
                                                                    } else {
                                                                        i12 = i13;
                                                                        r40 = ml;
                                                                    }
                                                                } else {
                                                                    int iHashCode2 = strXMQ2.hashCode();
                                                                    if (iHashCode2 != -53558318) {
                                                                        if (iHashCode2 != 0) {
                                                                            if (iHashCode2 != 187046506) {
                                                                                if (iHashCode2 != 187090232) {
                                                                                    if (iHashCode2 == 1504831518 && strXMQ2.equals("audio/mpeg")) {
                                                                                        str3 = "MP3Extractor audio";
                                                                                    }
                                                                                } else if (strXMQ2.equals("audio/mp4")) {
                                                                                    str3 = "MPEG4Extractor audio";
                                                                                }
                                                                            } else if (strXMQ2.equals("audio/AAC")) {
                                                                                str3 = "AAC audio";
                                                                            }
                                                                        } else if (strXMQ2.equals("")) {
                                                                            str4 = null;
                                                                            ml = new Ml(z5, iTy, str13, r02, iT, numKN, jVar2, 0L, str4);
                                                                            if (ml.Uo()) {
                                                                            }
                                                                        }
                                                                        str3 = StringsKt.removePrefix((String) r02, (CharSequence) "audio/") + "audio";
                                                                    } else if (!strXMQ2.equals("audio/mp4a-latm")) {
                                                                    }
                                                                    str4 = str3;
                                                                    ml = new Ml(z5, iTy, str13, r02, iT, numKN, jVar2, 0L, str4);
                                                                    if (ml.Uo()) {
                                                                    }
                                                                }
                                                                mediaExtractor = mediaExtractor3;
                                                                strExtractMetadata4 = str12;
                                                                i12 = i15;
                                                                strExtractMetadata3 = str10;
                                                                strExtractMetadata5 = str;
                                                                r14 = 0;
                                                                dAz = dAz;
                                                                r24 = r24;
                                                            } else {
                                                                str2 = strFindDecoderForFormat;
                                                            }
                                                            String strXMQ5 = Hr.aC.xMQ(mediaFormat);
                                                            r02 = strXMQ5;
                                                            if (strXMQ5 == null) {
                                                                r02 = "";
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                            int iTy2 = Hr.aC.ty(mediaFormat);
                                                            if (str2 != null) {
                                                            }
                                                            int iT2 = Hr.aC.t(mediaFormat);
                                                            Integer numKN2 = Hr.aC.KN(mediaFormat);
                                                            Integer numMUb2 = Hr.aC.mUb(mediaFormat);
                                                            if (numMUb2 != null) {
                                                                strXMQ2 = Hr.aC.xMQ(mediaFormat);
                                                                if (strXMQ2 == null) {
                                                                }
                                                            }
                                                            mediaExtractor = mediaExtractor3;
                                                            strExtractMetadata4 = str12;
                                                            i12 = i15;
                                                            strExtractMetadata3 = str10;
                                                            strExtractMetadata5 = str;
                                                            r14 = 0;
                                                            dAz = dAz;
                                                            r24 = r24;
                                                        } else {
                                                            r40 = r24;
                                                            i12 = i13;
                                                        }
                                                        Unit unit2 = Unit.INSTANCE;
                                                        i13 = i12;
                                                        r24 = r40;
                                                    }
                                                } else if (iHashCode == 112202875 && strSubstringBefore$default.equals("video")) {
                                                    u uVar2 = (u) objectRef.element;
                                                    if (uVar2 == null || !uVar2.mUb()) {
                                                        String strFindDecoderForFormat2 = Hr.aC.qie().findDecoderForFormat(mediaFormat);
                                                        if (strFindDecoderForFormat2 == null) {
                                                            strFindDecoderForFormat2 = Hr.CN3.t(Hr.aC.qie(), mediaFormat);
                                                        }
                                                        if (string4 != 0) {
                                                            str5 = strFindDecoderForFormat2;
                                                            if (StringsKt.startsWith$default((String) string4, "audio", false, 2, (Object) r14)) {
                                                                r03 = string4;
                                                            }
                                                            boolean z6 = str5 == null;
                                                            String str14 = str5 != null ? "" : str5;
                                                            Integer numKN3 = Hr.aC.KN(mediaFormat);
                                                            int iCk = Hr.aC.ck(mediaFormat);
                                                            int iO = Hr.aC.O(mediaFormat);
                                                            jVarArrValues = u.j.values();
                                                            length = jVarArrValues.length;
                                                            i9 = 0;
                                                            while (true) {
                                                                if (i9 < length) {
                                                                    str = strExtractMetadata5;
                                                                    jVar = null;
                                                                    break;
                                                                }
                                                                u.j jVar3 = jVarArrValues[i9];
                                                                jVarArr = jVarArrValues;
                                                                int iRl = jVar3.rl();
                                                                Integer numNr = Hr.aC.nr(mediaFormat);
                                                                str = strExtractMetadata5;
                                                                if (numNr != null && iRl == numNr.intValue()) {
                                                                    jVar = jVar3;
                                                                    break;
                                                                }
                                                                i9++;
                                                                jVarArrValues = jVarArr;
                                                                strExtractMetadata5 = str;
                                                            }
                                                            Integer numNr2 = Hr.aC.nr(mediaFormat);
                                                            int iIntValue2 = numNr2 == null ? numNr2.intValue() : -1;
                                                            List listEmptyList = CollectionsKt.emptyList();
                                                            Integer numUo = Hr.aC.Uo(mediaFormat);
                                                            int iIntValue3 = numUo == null ? numUo.intValue() : -1;
                                                            Integer numGh = Hr.aC.gh(mediaFormat);
                                                            int iIntValue4 = numGh == null ? numGh.intValue() : -1;
                                                            Integer numAz = Hr.aC.az(mediaFormat);
                                                            int iIntValue5 = numAz == null ? numAz.intValue() : -1;
                                                            strXMQ3 = Hr.aC.xMQ(mediaFormat);
                                                            if (strXMQ3 == null) {
                                                                strRemovePrefix = StringsKt.removePrefix((String) r03, (CharSequence) "video/");
                                                                str6 = strRemovePrefix;
                                                                uVar = new u(z6, str14, r03, numKN3, iCk, iO, jVar, iIntValue2, 0L, 0, listEmptyList, 0, iIntValue5, iIntValue3, iIntValue4, 0L, 0L, 0L, 0L, str6);
                                                                objectRef.element = uVar;
                                                                if (uVar.mUb()) {
                                                                    mediaExtractor3 = mediaExtractor;
                                                                    try {
                                                                        mediaExtractor3.selectTrack(i12);
                                                                    } catch (IllegalArgumentException unused2) {
                                                                        objectRef.element = null;
                                                                        i12 = i14;
                                                                    }
                                                                    Unit unit3 = Unit.INSTANCE;
                                                                    i14 = i12;
                                                                    z4 = false;
                                                                } else {
                                                                    mediaExtractor3 = mediaExtractor;
                                                                }
                                                            } else {
                                                                int iHashCode3 = strXMQ3.hashCode();
                                                                if (iHashCode3 != -1662541442) {
                                                                    if (iHashCode3 != 0) {
                                                                        if (iHashCode3 == 1331836730 ? strXMQ3.equals("video/avc") : iHashCode3 == 1331848029 && strXMQ3.equals("video/mp4")) {
                                                                            strRemovePrefix = "AVC/H264";
                                                                        }
                                                                        str6 = strRemovePrefix;
                                                                        uVar = new u(z6, str14, r03, numKN3, iCk, iO, jVar, iIntValue2, 0L, 0, listEmptyList, 0, iIntValue5, iIntValue3, iIntValue4, 0L, 0L, 0L, 0L, str6);
                                                                        objectRef.element = uVar;
                                                                        if (uVar.mUb()) {
                                                                        }
                                                                    } else if (strXMQ3.equals("")) {
                                                                        str6 = null;
                                                                        uVar = new u(z6, str14, r03, numKN3, iCk, iO, jVar, iIntValue2, 0L, 0, listEmptyList, 0, iIntValue5, iIntValue3, iIntValue4, 0L, 0L, 0L, 0L, str6);
                                                                        objectRef.element = uVar;
                                                                        if (uVar.mUb()) {
                                                                        }
                                                                    }
                                                                    strRemovePrefix = StringsKt.removePrefix((String) r03, (CharSequence) "video/");
                                                                    str6 = strRemovePrefix;
                                                                    uVar = new u(z6, str14, r03, numKN3, iCk, iO, jVar, iIntValue2, 0L, 0, listEmptyList, 0, iIntValue5, iIntValue3, iIntValue4, 0L, 0L, 0L, 0L, str6);
                                                                    objectRef.element = uVar;
                                                                    if (uVar.mUb()) {
                                                                    }
                                                                } else {
                                                                    if (strXMQ3.equals("video/hevc")) {
                                                                        strRemovePrefix = "HEVC/H.265";
                                                                    }
                                                                    str6 = strRemovePrefix;
                                                                    uVar = new u(z6, str14, r03, numKN3, iCk, iO, jVar, iIntValue2, 0L, 0, listEmptyList, 0, iIntValue5, iIntValue3, iIntValue4, 0L, 0L, 0L, 0L, str6);
                                                                    objectRef.element = uVar;
                                                                    if (uVar.mUb()) {
                                                                    }
                                                                }
                                                            }
                                                            mediaExtractor = mediaExtractor3;
                                                            strExtractMetadata4 = str12;
                                                            i12 = i15;
                                                            strExtractMetadata3 = str10;
                                                            strExtractMetadata5 = str;
                                                            r14 = 0;
                                                            dAz = dAz;
                                                            r24 = r24;
                                                        } else {
                                                            str5 = strFindDecoderForFormat2;
                                                        }
                                                        String strXMQ6 = Hr.aC.xMQ(mediaFormat);
                                                        r03 = strXMQ6;
                                                        if (strXMQ6 == null) {
                                                            r03 = "";
                                                        }
                                                        if (str5 == null) {
                                                        }
                                                        if (str5 != null) {
                                                        }
                                                        Integer numKN32 = Hr.aC.KN(mediaFormat);
                                                        int iCk2 = Hr.aC.ck(mediaFormat);
                                                        int iO2 = Hr.aC.O(mediaFormat);
                                                        jVarArrValues = u.j.values();
                                                        length = jVarArrValues.length;
                                                        i9 = 0;
                                                        while (true) {
                                                            if (i9 < length) {
                                                            }
                                                            i9++;
                                                            jVarArrValues = jVarArr;
                                                            strExtractMetadata5 = str;
                                                        }
                                                        Integer numNr22 = Hr.aC.nr(mediaFormat);
                                                        if (numNr22 == null) {
                                                        }
                                                        List listEmptyList2 = CollectionsKt.emptyList();
                                                        Integer numUo2 = Hr.aC.Uo(mediaFormat);
                                                        if (numUo2 == null) {
                                                        }
                                                        Integer numGh2 = Hr.aC.gh(mediaFormat);
                                                        if (numGh2 == null) {
                                                        }
                                                        Integer numAz2 = Hr.aC.az(mediaFormat);
                                                        if (numAz2 == null) {
                                                        }
                                                        strXMQ3 = Hr.aC.xMQ(mediaFormat);
                                                        if (strXMQ3 == null) {
                                                        }
                                                        mediaExtractor = mediaExtractor3;
                                                        strExtractMetadata4 = str12;
                                                        i12 = i15;
                                                        strExtractMetadata3 = str10;
                                                        strExtractMetadata5 = str;
                                                        r14 = 0;
                                                        dAz = dAz;
                                                        r24 = r24;
                                                    } else {
                                                        mediaExtractor3 = mediaExtractor;
                                                        str = strExtractMetadata5;
                                                    }
                                                    i12 = i14;
                                                    Unit unit32 = Unit.INSTANCE;
                                                    i14 = i12;
                                                    z4 = false;
                                                    mediaExtractor = mediaExtractor3;
                                                    strExtractMetadata4 = str12;
                                                    i12 = i15;
                                                    strExtractMetadata3 = str10;
                                                    strExtractMetadata5 = str;
                                                    r14 = 0;
                                                    dAz = dAz;
                                                    r24 = r24;
                                                } else {
                                                    mediaExtractor3 = mediaExtractor;
                                                    str = strExtractMetadata5;
                                                }
                                                XoT.C.KN("TESTTEST", new Function0() { // from class: tu.z
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return r.S(string3, string4);
                                                    }
                                                });
                                                strXMQ = Hr.aC.xMQ(mediaFormat);
                                                r24 = r24;
                                                if (strXMQ != null) {
                                                    linkedHashSet.add(strXMQ);
                                                    Unit unit4 = Unit.INSTANCE;
                                                    r24 = r24;
                                                }
                                            } else {
                                                mediaExtractor3 = mediaExtractor;
                                                str = strExtractMetadata5;
                                                if (strSubstringBefore$default.equals("text")) {
                                                    if (dAz == 0 || !dAz.n()) {
                                                        String strXMQ7 = Hr.aC.xMQ(mediaFormat);
                                                        if (strXMQ7 == null) {
                                                            strXMQ7 = "";
                                                        }
                                                        String strJ22 = Hr.aC.J2(mediaFormat);
                                                        if (strJ22 == null) {
                                                            strJ22 = "";
                                                        }
                                                        z4 = false;
                                                        dAz = new DAz(false, strXMQ7, strJ22);
                                                    } else {
                                                        z4 = false;
                                                        dAz = dAz;
                                                    }
                                                    Unit unit5 = Unit.INSTANCE;
                                                    mediaExtractor = mediaExtractor3;
                                                    strExtractMetadata4 = str12;
                                                    i12 = i15;
                                                    strExtractMetadata3 = str10;
                                                    strExtractMetadata5 = str;
                                                    r14 = 0;
                                                    dAz = dAz;
                                                    r24 = r24;
                                                }
                                                XoT.C.KN("TESTTEST", new Function0() { // from class: tu.z
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return r.S(string3, string4);
                                                    }
                                                });
                                                strXMQ = Hr.aC.xMQ(mediaFormat);
                                                r24 = r24;
                                                if (strXMQ != null) {
                                                }
                                            }
                                            z4 = false;
                                            mediaExtractor = mediaExtractor3;
                                            strExtractMetadata4 = str12;
                                            i12 = i15;
                                            strExtractMetadata3 = str10;
                                            strExtractMetadata5 = str;
                                            r14 = 0;
                                            dAz = dAz;
                                            r24 = r24;
                                        }
                                        MediaExtractor mediaExtractor5 = mediaExtractor;
                                        String str15 = strExtractMetadata3;
                                        String str16 = strExtractMetadata4;
                                        String str17 = strExtractMetadata5;
                                        ArrayList arrayList2 = new ArrayList();
                                        final Ref.LongRef longRef2 = new Ref.LongRef();
                                        final Ref.LongRef longRef3 = new Ref.LongRef();
                                        Ref.LongRef longRef4 = new Ref.LongRef();
                                        boolean z7 = false;
                                        long jMin = 0;
                                        long jMax = 0;
                                        long j5 = -1;
                                        long j6 = 0;
                                        long j7 = 0;
                                        long jMin2 = 0;
                                        long jMax2 = 0;
                                        ?? r3 = intOrNull2;
                                        while (true) {
                                            int sampleTrackIndex = mediaExtractor5.getSampleTrackIndex();
                                            int i16 = i14;
                                            if (sampleTrackIndex == i16) {
                                                r98 = r3;
                                                i5 = i16;
                                                longRef2.element++;
                                                boolean zN = XoT.j.n(mediaExtractor5.getSampleFlags(), 1);
                                                boolean zN2 = XoT.j.n(mediaExtractor5.getSampleFlags(), 2);
                                                Ref.LongRef longRef5 = longRef4;
                                                long sampleTime = mediaExtractor5.getSampleTime();
                                                if (j5 == -1) {
                                                    j5 = sampleTime;
                                                }
                                                boolean z9 = z7 || zN2;
                                                if (zN) {
                                                    arrayList2.add(Long.valueOf(sampleTime));
                                                }
                                                int i17 = iIntValue;
                                                if (longRef2.element == 1) {
                                                    longRef = longRef5;
                                                    longRef.element = sampleTime;
                                                    j7 = sampleTime;
                                                    z3 = z9;
                                                    mediaExtractor2 = mediaExtractor5;
                                                } else {
                                                    z3 = z9;
                                                    mediaExtractor2 = mediaExtractor5;
                                                    longRef = longRef5;
                                                    long jMin3 = Math.min(j7, sampleTime);
                                                    longRef.element = Math.max(longRef.element, sampleTime);
                                                    j7 = jMin3;
                                                }
                                                long j9 = longRef2.element;
                                                i3 = i17;
                                                if (j9 > 1) {
                                                    long j10 = sampleTime - j6;
                                                    if (j9 > 2) {
                                                        jMin2 = Math.min(jMin2, j10);
                                                        jMax2 = Math.max(jMax2, j10);
                                                    } else {
                                                        jMax2 = jMax2;
                                                        jMin2 = jMin2;
                                                    }
                                                    arrayList = arrayList2;
                                                    z7 = z3;
                                                    j4 = j5;
                                                    i7 = i13;
                                                    j6 = sampleTime;
                                                }
                                            } else {
                                                int i18 = iIntValue;
                                                longRef = longRef4;
                                                i3 = i18;
                                                arrayList = arrayList2;
                                                r98 = r3;
                                                i5 = i16;
                                                mediaExtractor2 = mediaExtractor5;
                                                i7 = i13;
                                                long j11 = jMin2;
                                                long j12 = jMax2;
                                                boolean z10 = z7;
                                                long j13 = j7;
                                                if (sampleTrackIndex == i7) {
                                                    longRef3.element++;
                                                    long sampleTime2 = mediaExtractor2.getSampleTime();
                                                    j3 = j13;
                                                    if (longRef3.element == 1) {
                                                        jMin = sampleTime2;
                                                        jMax = jMin;
                                                    } else {
                                                        jMin = Math.min(jMin, sampleTime2);
                                                        jMax = Math.max(jMax, sampleTime2);
                                                    }
                                                } else {
                                                    j3 = j13;
                                                }
                                                j4 = j5;
                                                z7 = z10;
                                                jMin2 = j11;
                                                jMax2 = j12;
                                                j7 = j3;
                                            }
                                            if (!mediaExtractor2.advance()) {
                                                i8 = i3;
                                                break;
                                            }
                                            i8 = i3;
                                            long j14 = jMin;
                                            if (z2 && ((longRef3.element >= 500 || longRef2.element >= 100) && (arrayList.size() >= 5 || longRef2.element >= 1000))) {
                                                break;
                                            }
                                            i13 = i7;
                                            j5 = j4;
                                            longRef4 = longRef;
                                            mediaExtractor5 = mediaExtractor2;
                                            arrayList2 = arrayList;
                                            jMin = j14;
                                            r3 = r98;
                                            iIntValue = i8;
                                            i14 = i5;
                                        }
                                        long j15 = longRef.element;
                                        final long j16 = j15 > 0 ? j15 / longRef2.element : 0L;
                                        final double d2 = j15 > 0 ? longRef2.element / (((j15 + j16) - 1) / 1000000.0d) : 0.0d;
                                        mediaExtractor2.release();
                                        long jLongValue3 = ((str15 == null || (longOrNull = StringsKt.toLongOrNull(str15)) == null) ? 0L : longOrNull.longValue()) * 1000;
                                        if (str16 == null) {
                                            u uVar3 = (u) objectRef.element;
                                            strKN = uVar3 != null ? uVar3.KN() : null;
                                            if (strKN == null) {
                                                strKN = r24 != 0 ? r24.O() : null;
                                                if (strKN == null) {
                                                    strKN = "";
                                                }
                                            }
                                        } else {
                                            strKN = str16;
                                        }
                                        u uVar4 = (u) objectRef.element;
                                        int iGh = uVar4 != null ? uVar4.gh() : 0;
                                        u uVar5 = (u) objectRef.element;
                                        int iJ2 = uVar5 != null ? uVar5.J2() : 0;
                                        u uVar6 = (u) objectRef.element;
                                        String str18 = strKN;
                                        if (uVar6 != null) {
                                            long j17 = z2 ? jLongValue3 : longRef.element;
                                            int iRint = (int) Math.rint(100.0d * d2);
                                            long jMax3 = Math.max(j4, 0L);
                                            long jN = (long) XoT.Xo.n(SequencesKt.averageOfLong(SequencesKt.zipWithNext(CollectionsKt.asSequence(arrayList), new Function2() { // from class: tu.QJ
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    return Long.valueOf(r.WPU(((Long) obj2).longValue(), ((Long) obj3).longValue()));
                                                }
                                            })), 0.0d);
                                            if (z2) {
                                                jLongValue = -1;
                                            } else {
                                                Long l2 = (Long) SequencesKt.maxOrNull(SequencesKt.zipWithNext(CollectionsKt.asSequence(arrayList), new Function2() { // from class: tu.l3D
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        return Long.valueOf(r.aYN(((Long) obj2).longValue(), ((Long) obj3).longValue()));
                                                    }
                                                }));
                                                jLongValue = l2 != null ? l2.longValue() : 0L;
                                            }
                                            if (z2) {
                                                jLongValue2 = -1;
                                            } else {
                                                Long l5 = (Long) SequencesKt.minOrNull(SequencesKt.zipWithNext(CollectionsKt.asSequence(arrayList), new Function2() { // from class: tu.c
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        return Long.valueOf(r.ViF(((Long) obj2).longValue(), ((Long) obj3).longValue()));
                                                    }
                                                }));
                                                jLongValue2 = l5 != null ? l5.longValue() : 0L;
                                            }
                                            uVarRl = u.rl(uVar6, false, null, null, null, 0, 0, null, 0, j17, iRint, z2 ? CollectionsKt.emptyList() : arrayList, z2 ? -1 : arrayList.size(), 0, 0, 0, jLongValue2, jLongValue, jN, jMax3, null, 553215, null);
                                        } else {
                                            uVarRl = null;
                                        }
                                        Ml mlRl = r24 != 0 ? Ml.rl(r24, false, 0, null, null, 0, null, null, z2 ? jLongValue3 : jMax, null, 383, null) : null;
                                        if (!z2) {
                                            jLongValue3 = Math.max(longRef.element, jMax);
                                        }
                                        int iIntValue6 = r98 != 0 ? r98.intValue() : 0;
                                        if (str17 != null) {
                                            str9 = str17;
                                        }
                                        final Ref.LongRef longRef6 = longRef;
                                        final aC aCVar2 = new aC(uri, str18, jLongValue3, null, uVarRl, mlRl, iGh, iJ2, iIntValue6, null, i8, length2, str9, null, System.nanoTime() - j2, z2, filename);
                                        final ArrayList arrayList3 = arrayList;
                                        XoT.C.KN("MediaInfo", new Function0() { // from class: tu.s4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return r.nY(arrayList3, d2, j16, longRef6, longRef3, longRef2, aCVar2);
                                            }
                                        });
                                        return aCVar2;
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                }
                                th2 = th;
                            } else {
                                try {
                                    try {
                                        assetFileDescriptorNr = q2.nr(uri, "r");
                                    } catch (IOException | SecurityException unused3) {
                                        r04 = bArr;
                                        str7 = options.outMimeType;
                                        if (str7 == null) {
                                            switch (cn3N != null ? -1 : j.$EnumSwitchMapping$0[cn3N.ordinal()]) {
                                            }
                                        }
                                        Intrinsics.checkNotNull(str8);
                                        Dsr dsr = new Dsr(true, str8, options.outWidth, options.outHeight);
                                        if (r04 != 0) {
                                        }
                                        if (iUo != 1) {
                                        }
                                        int i19 = i10;
                                        if (r04 != 0) {
                                        }
                                        int i20 = options.outWidth;
                                        int i21 = options.outHeight;
                                        if (r04 != 0) {
                                            string = strJ2;
                                        }
                                        return new aC(uri, str8, 0L, dsr, null, null, i20, i21, i19, J2, 0, length2, string, null, System.nanoTime() - j2, false, filename);
                                    }
                                } catch (IOException | SecurityException unused4) {
                                    bArr = null;
                                    r04 = bArr;
                                    str7 = options.outMimeType;
                                    if (str7 == null) {
                                    }
                                    Intrinsics.checkNotNull(str8);
                                    Dsr dsr2 = new Dsr(true, str8, options.outWidth, options.outHeight);
                                    if (r04 != 0) {
                                    }
                                    if (iUo != 1) {
                                    }
                                    int i192 = i10;
                                    if (r04 != 0) {
                                    }
                                    int i202 = options.outWidth;
                                    int i212 = options.outHeight;
                                    if (r04 != 0) {
                                    }
                                    return new aC(uri, str8, 0L, dsr2, null, null, i202, i212, i192, J2, 0, length2, string, null, System.nanoTime() - j2, false, filename);
                                }
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(assetFileDescriptorNr.getFileDescriptor());
                                    try {
                                        try {
                                            fileInputStream2.skip(assetFileDescriptorNr.getStartOffset());
                                            ExifInterface exifInterface = new ExifInterface(fileInputStream2);
                                            bArr = null;
                                            CloseableKt.closeFinally(fileInputStream2, null);
                                            CloseableKt.closeFinally(assetFileDescriptorNr, null);
                                            r04 = exifInterface;
                                            str7 = options.outMimeType;
                                            if (str7 == null || StringsKt.isBlank(str7)) {
                                                switch (cn3N != null ? -1 : j.$EnumSwitchMapping$0[cn3N.ordinal()]) {
                                                    case 1:
                                                        str8 = "image/jpeg";
                                                        break;
                                                    case 2:
                                                        str8 = MimeTypes.IMAGE_BMP;
                                                        break;
                                                    case 3:
                                                        str8 = MimeTypes.IMAGE_PNG;
                                                        break;
                                                    case 4:
                                                        str8 = MimeTypes.IMAGE_WEBP;
                                                        break;
                                                    case 5:
                                                        str8 = "image/gif";
                                                        break;
                                                    case 6:
                                                        str8 = "image/tiff";
                                                        break;
                                                    default:
                                                        str8 = "";
                                                        break;
                                                }
                                            } else {
                                                str8 = options.outMimeType;
                                            }
                                            Intrinsics.checkNotNull(str8);
                                            Dsr dsr22 = new Dsr(true, str8, options.outWidth, options.outHeight);
                                            iUo = r04 != 0 ? r04.Uo("Orientation", 1) : 1;
                                            if (iUo != 1) {
                                                if (iUo == 3) {
                                                    i10 = 180;
                                                } else if (iUo == 6) {
                                                    i10 = 90;
                                                } else if (iUo == 8) {
                                                    i10 = 270;
                                                }
                                            }
                                            int i1922 = i10;
                                            ?? J2 = r04 != 0 ? r04.J2("Copyright") : bArr;
                                            int i2022 = options.outWidth;
                                            int i2122 = options.outHeight;
                                            if (r04 != 0 && (strJ2 = r04.J2("ImageDescription")) != null) {
                                                string = strJ2;
                                            }
                                            return new aC(uri, str8, 0L, dsr22, null, null, i2022, i2122, i1922, J2, 0, length2, string, null, System.nanoTime() - j2, false, filename);
                                        } catch (Throwable th11) {
                                            th = th11;
                                            Throwable th12 = th;
                                            try {
                                                throw th12;
                                            } catch (Throwable th13) {
                                                CloseableKt.closeFinally(assetFileDescriptorNr, th12);
                                                throw th13;
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (FileNotFoundException e15) {
            Set set2 = f74019n;
            synchronized (set2) {
                set2.add(uri);
                return new C("Missing media", 2132019626, e15);
            }
        } catch (IOException e16) {
            XoT.C.ck("readFileMediaInfo", e16, new Function0() { // from class: tu.Xo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.Z();
                }
            });
            return new C("Could not read media file", 2132019601, e16);
        } catch (SecurityException e17) {
            XoT.C.ck("readFileMediaInfo", e17, new Function0() { // from class: tu.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.XQ();
                }
            });
            return new C("No permisson to read media", 2132019600, e17);
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CN3.values().length];
            try {
                iArr[CN3.f73872t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CN3.E2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CN3.f73864O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CN3.f73870o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CN3.J2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CN3.f73871r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2() {
        return "IOException Reading Media Info";
    }

    public static final boolean HI(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        Dsr dsrUo = aCVar.Uo();
        if (dsrUo != null) {
            return dsrUo.n();
        }
        return false;
    }

    public static final boolean Ik(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        return ty(aCVar) || ck(aCVar) || HI(aCVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(String str, String str2) {
        return "TESTTEST :: AKK :: " + str + ", " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T() {
        return "Unknown error Reading Media Info";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X() {
        return "Unknown error Reading Media Info";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "SecurityException Reading Media Info";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z() {
        return "IOException Reading Media Info";
    }

    public static final boolean az(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        if (!Ik(aCVar)) {
            return false;
        }
        Ml mlN = aCVar.n();
        if (!(mlN != null ? mlN.Uo() : true)) {
            return false;
        }
        u uVarGh = aCVar.gh();
        if (!(uVarGh != null ? uVarGh.mUb() : true)) {
            return false;
        }
        Dsr dsrUo = aCVar.Uo();
        return dsrUo != null ? dsrUo.n() : true;
    }

    public static final boolean ck(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        u uVarGh = aCVar.gh();
        if (uVarGh != null) {
            return uVarGh.mUb();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return "SecurityException Reading Media Info";
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ec, code lost:
    
        if (r3.equals("") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        if (r3.equals("") == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SPz fD(Uri uri) {
        u uVar;
        Ml ml;
        String str;
        String str2;
        String str3;
        String strRemovePrefix;
        long jNanoTime = System.nanoTime();
        Dsr dsr = null;
        LQ.j jVar = (LQ.j) GJW.aC.rl(null, new n(uri, null), 1, null);
        if (jVar instanceof j.n) {
            N1.n nVar = (N1.n) ((j.n) jVar).n();
            if (nVar instanceof N1.w6) {
                Set set = f74019n;
                synchronized (set) {
                    set.add(uri);
                }
                return new C("Missing media", 2132019626, ((N1.w6) nVar).n());
            }
            if (nVar instanceof N1.I28) {
                N1.I28 i28 = (N1.I28) nVar;
                XoT.C.ck("readFileMediaInfo", i28.n(), new Function0() { // from class: tu.UGc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.E2();
                    }
                });
                return new C("Could not read media file", 2132019601, i28.n());
            }
            if (nVar instanceof N1.CN3) {
                N1.CN3 cn3 = (N1.CN3) nVar;
                XoT.C.ck("readFileMediaInfo", cn3.n(), new Function0() { // from class: tu.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.e();
                    }
                });
                return new C("No permission to read media", 2132019600, cn3.n());
            }
            if (!(nVar instanceof N1.Ml)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objN = ((N1.Ml) nVar).n();
            Throwable th = objN instanceof Throwable ? (Throwable) objN : null;
            if (th != null) {
                XoT.C.ck("readFileMediaInfo", th, new Function0() { // from class: tu.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.X();
                    }
                });
            } else {
                XoT.C.Ik("readFileMediaInfo", new Function0() { // from class: tu.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.T();
                    }
                });
            }
            return new C("Could not read media file", 2132019601, th);
        }
        if (!(jVar instanceof j.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        N1.Wre wre = (N1.Wre) ((j.w6) jVar).n();
        if (!wre.xMQ()) {
            Uri uriMUb = wre.mUb();
            String strNr = wre.nr();
            if (strNr == null) {
                strNr = "";
            }
            String str4 = strNr;
            d2n.j jVarO = wre.O();
            return new aC(uriMUb, str4, jVarO != null ? d2n.j.az(jVarO.WPU()) : 0L, null, null, null, 0, 0, 0, null, 0, wre.J2() != null ? r3.intValue() : 0L, wre.Uo(), null, System.nanoTime() - jNanoTime, false, wre.Uo());
        }
        MoG.QJ qjGh = wre.gh();
        if (qjGh != null) {
            String strJ2 = ((eO.n) qjGh.n().n()).J2();
            int iT = ((eO.n) qjGh.n().n()).rl().rl().t();
            int iRl = ((eO.n) qjGh.n().n()).rl().rl().rl();
            d2n.j jVarO2 = wre.O();
            long jAz = jVarO2 != null ? d2n.j.az(jVarO2.WPU()) : 0L;
            Float fT = ((eO.n) qjGh.n().n()).t();
            int iRoundToInt = fT != null ? MathKt.roundToInt(fT.floatValue()) : -1;
            List listEmptyList = CollectionsKt.emptyList();
            int iRl2 = ((eO.n) qjGh.n().n()).rl().n().rl();
            Integer numNr = ((eO.n) qjGh.n().n()).nr();
            int iIntValue = numNr != null ? numNr.intValue() : -1;
            Integer numO = ((eO.n) qjGh.n().n()).O();
            int iIntValue2 = numO != null ? numO.intValue() : -1;
            String strN = ((eO.n) qjGh.n().n()).n();
            if (strN == null) {
                str3 = null;
                uVar = new u(true, "", strJ2, null, iT, iRl, null, -1, jAz, iRoundToInt, listEmptyList, 0, iRl2, iIntValue, iIntValue2, 0L, 0L, 0L, 0L, str3);
            } else {
                int iHashCode = strN.hashCode();
                if (iHashCode != -1662541442) {
                    if (iHashCode != 0) {
                        if (iHashCode == 1331836730 ? strN.equals("video/avc") : iHashCode == 1331848029 && strN.equals("video/mp4")) {
                            strRemovePrefix = "AVC/H264";
                        }
                        str3 = strRemovePrefix;
                        uVar = new u(true, "", strJ2, null, iT, iRl, null, -1, jAz, iRoundToInt, listEmptyList, 0, iRl2, iIntValue, iIntValue2, 0L, 0L, 0L, 0L, str3);
                    }
                    str3 = strRemovePrefix;
                    uVar = new u(true, "", strJ2, null, iT, iRl, null, -1, jAz, iRoundToInt, listEmptyList, 0, iRl2, iIntValue, iIntValue2, 0L, 0L, 0L, 0L, str3);
                } else {
                    strRemovePrefix = !strN.equals("video/hevc") ? StringsKt.removePrefix(strN, (CharSequence) "video/") : "HEVC/H.265";
                    str3 = strRemovePrefix;
                    uVar = new u(true, "", strJ2, null, iT, iRl, null, -1, jAz, iRoundToInt, listEmptyList, 0, iRl2, iIntValue, iIntValue2, 0L, 0L, 0L, 0L, str3);
                }
            }
        } else {
            uVar = null;
        }
        MoG.Wre wreT = wre.t();
        int iRl3 = 0;
        if (wreT != null) {
            int iNr = ((eO.j) wreT.rl().n()).nr();
            String strT = ((eO.j) wreT.rl().n()).t();
            int iN = ((eO.j) wreT.rl().n()).n();
            Ml.j jVar2 = Ml.j.J2;
            d2n.j jVarO3 = wre.O();
            long jAz2 = jVarO3 != null ? d2n.j.az(jVarO3.WPU()) : 0L;
            String strRl = ((eO.j) wreT.rl().n()).rl();
            if (strRl == null) {
                str = null;
                ml = new Ml(true, iNr, "", strT, iN, 0, jVar2, jAz2, str);
            } else {
                int iHashCode2 = strRl.hashCode();
                if (iHashCode2 != -53558318) {
                    if (iHashCode2 != 0) {
                        if (iHashCode2 != 187046506) {
                            if (iHashCode2 != 187090232) {
                                if (iHashCode2 == 1504831518 && strRl.equals("audio/mpeg")) {
                                    str2 = "MP3Extractor audio";
                                }
                            } else if (strRl.equals("audio/mp4")) {
                                str2 = "MPEG4Extractor audio";
                            }
                        } else if (strRl.equals("audio/AAC")) {
                            str2 = "AAC audio";
                        }
                    }
                    str2 = StringsKt.removePrefix(strRl, (CharSequence) "audio/") + "audio";
                } else if (!strRl.equals("audio/mp4a-latm")) {
                    str2 = StringsKt.removePrefix(strRl, (CharSequence) "audio/") + "audio";
                }
                str = str2;
                ml = new Ml(true, iNr, "", strT, iN, 0, jVar2, jAz2, str);
            }
        } else {
            ml = null;
        }
        MoG.qz qzVarKN = wre.KN();
        if (qzVarKN != null) {
            String strNr2 = wre.nr();
            if (strNr2 == null) {
                strNr2 = "";
            }
            dsr = new Dsr(true, strNr2, qzVarKN.n().rl().t(), qzVarKN.n().rl().rl());
        }
        Dsr dsr2 = dsr;
        Uri uriMUb2 = wre.mUb();
        String strNr3 = wre.nr();
        if (strNr3 == null) {
            strNr3 = "";
        }
        String str5 = strNr3;
        int iGh = uVar != null ? uVar.gh() : 0;
        int iJ2 = uVar != null ? uVar.J2() : 0;
        MoG.QJ qjGh2 = wre.gh();
        if (qjGh2 != null) {
            iRl3 = ((eO.n) qjGh2.n().n()).rl().n().rl();
        } else {
            MoG.qz qzVarKN2 = wre.KN();
            if (qzVarKN2 != null) {
                iRl3 = qzVarKN2.n().n().rl();
            }
        }
        int i2 = iRl3;
        d2n.j jVarO4 = wre.O();
        return new aC(uriMUb2, str5, jVarO4 != null ? d2n.j.az(jVarO4.WPU()) : 0L, dsr2, uVar, ml, iGh, iJ2, i2, null, 0, wre.J2() != null ? r3.intValue() : 0L, wre.Uo(), null, System.nanoTime() - jNanoTime, false, wre.Uo());
    }

    public static final SPz g(HI0.Q contentResolver, Uri uri, boolean z2) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Map map = rl;
        aC aCVar = (aC) map.get(uri);
        if (aCVar != null) {
            return aCVar;
        }
        SPz sPzIF = iF(contentResolver, uri, z2);
        if (sPzIF instanceof aC) {
            map.put(uri, sPzIF);
        }
        return sPzIF;
    }

    private static final SPz iF(HI0.Q q2, Uri uri, boolean z2) {
        String strSubstringAfter$default;
        int iIntValue;
        Integer intOrNull;
        Integer intOrNull2;
        if (!Intrinsics.areEqual(uri.getScheme(), kPg.fuX.f69922n.rl())) {
            SPz sPzFD = fD(uri);
            if (sPzFD instanceof aC) {
                return sPzFD;
            }
            SPz sPzO = o(uri, q2, z2);
            return ((sPzO instanceof aC) && HI((aC) sPzO)) ? sPzO : sPzFD;
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (schemeSpecificPart == null || (strSubstringAfter$default = StringsKt.substringAfter$default(schemeSpecificPart, '?', (String) null, 2, (Object) null)) == null) {
            strSubstringAfter$default = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstringAfter$default, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            Pair pairXMQ = kPg.fuX.xMQ(kPg.fuX.f69922n, (String) it.next(), (char) 0, 1, null);
            if (pairXMQ != null) {
                arrayList.add(pairXMQ);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        String str = (String) map.get("w");
        int iIntValue2 = (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull2.intValue();
        String str2 = (String) map.get(CmcdData.STREAMING_FORMAT_HLS);
        if (str2 != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        int i2 = iIntValue;
        Dsr dsr = new Dsr(true, MimeTypes.IMAGE_WEBP, iIntValue2, i2);
        kPg.n nVarT = kPg.fuX.f69922n.t(uri);
        return new aC(uri, MimeTypes.IMAGE_WEBP, 0L, dsr, null, null, iIntValue2, i2, 0, null, 0, 1024L, nVarT != null ? kPg.Wre.Uo(nVarT) : null, null, 0L, false, uri.getLastPathSegment());
    }

    public static final boolean r(Uri uri) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Set set = f74019n;
        synchronized (set) {
            zContains = set.contains(uri);
        }
        return zContains;
    }

    public static /* synthetic */ SPz te(HI0.Q q2, Uri uri, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return g(q2, uri, z2);
    }

    public static final boolean ty(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        Ml mlN = aCVar.n();
        if (mlN != null) {
            return mlN.Uo();
        }
        return false;
    }

    public static final Object N(HI0.Q q2, Uri uri, Map map, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new w6(map, uri, q2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nY(List list, double d2, long j2, Ref.LongRef longRef, Ref.LongRef longRef2, Ref.LongRef longRef3, aC aCVar) {
        return "MediaInfo : videoSyncFrames.size=" + list.size() + " averageFps=" + d2 + " averageGap=" + j2 + " maxVideoTs=" + longRef.element + " audioChunkCount=" + longRef2.element + " videoFrameCount=" + longRef3.element + " " + aCVar;
    }
}
