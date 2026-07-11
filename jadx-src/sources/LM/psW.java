package LM;

import android.content.Context;
import android.net.Uri;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class psW {

    static final class j extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f6049O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6050n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f6051r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6052t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
            this.f6051r = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.J2, this.f6051r, continuation);
            jVar.f6049O = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((j) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        
            if (r1.yield(r8, r7) == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:18:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            int i2;
            SequenceScope sequenceScope2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f6052t;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i5 = this.f6050n;
                        sequenceScope2 = (SequenceScope) this.f6049O;
                        ResultKt.throwOnFailure(obj);
                        if (i5 == Integer.MAX_VALUE) {
                            i2 = i5 + 1;
                            str = this.J2 + "_" + i2 + "." + this.f6051r;
                            this.f6049O = sequenceScope2;
                            this.f6050n = i2;
                            this.f6052t = 2;
                            if (sequenceScope2.yield(str, this) != coroutine_suspended) {
                                i5 = i2;
                                if (i5 == Integer.MAX_VALUE) {
                                    return Unit.INSTANCE;
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sequenceScope = (SequenceScope) this.f6049O;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f6049O;
                String str2 = this.J2 + "." + this.f6051r;
                this.f6049O = sequenceScope;
                this.f6052t = 1;
            }
            i2 = 1;
            sequenceScope2 = sequenceScope;
            str = this.J2 + "_" + i2 + "." + this.f6051r;
            this.f6049O = sequenceScope2;
            this.f6050n = i2;
            this.f6052t = 2;
            if (sequenceScope2.yield(str, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSchemeSpecificPart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence KN(String str, String str2) {
        return SequencesKt.sequence(new j(str, str2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(List list, Set set, List list2) {
        return "cleanUnusedInternalMedia:  ALL=" + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) + "  REQUIRED=" + CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null) + " unusedMedia=" + CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, new Function1() { // from class: LM.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psW.Ik((File) obj);
            }
        }, 30, null);
    }

    public static final void gh(Context context) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(context, "context");
        File[] fileArrListFiles2 = HI0.afx.az(context).listFiles(new FileFilter() { // from class: LM.M
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return psW.qie(file);
            }
        });
        if (fileArrListFiles2 == null || (fileArrListFiles = HI0.afx.gh(context).listFiles()) == null) {
            return;
        }
        final Set set = SequencesKt.toSet(SequencesKt.map(SequencesKt.filter(SequencesKt.flatMap(ArraysKt.asSequence(fileArrListFiles2), new Function1() { // from class: LM.rv6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psW.az((File) obj);
            }
        }), new Function1() { // from class: LM.vd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(psW.ty((Uri) obj));
            }
        }), new Function1() { // from class: LM.Lu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psW.HI((Uri) obj);
            }
        }));
        final ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(file.getName());
        }
        final ArrayList<File> arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (!set.contains(file2.getName())) {
                arrayList2.add(file2);
            }
        }
        XoT.C.Uo(context, new Function0() { // from class: LM.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return psW.ck(arrayList, set, arrayList2);
            }
        });
        for (File file3 : arrayList2) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m313constructorimpl(Boolean.valueOf(file3.delete()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public static /* synthetic */ byte[] mUb(InputStream inputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 32768;
        }
        return xMQ(inputStream, i2);
    }

    public static /* synthetic */ byte[] o(InputStream inputStream, OutputStream outputStream, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 32768;
        }
        return r(inputStream, outputStream, i2, function1);
    }

    public static final byte[] r(InputStream inputStream, OutputStream out, int i2, Function1 progressCb) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(progressCb, "progressCb");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            messageDigest.update(bArr, 0, i3);
            out.write(bArr, 0, i3);
            j2 += (long) i3;
            progressCb.invoke(Long.valueOf(j2));
            i3 = inputStream.read(bArr);
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getScheme(), "am");
    }

    public static final byte[] xMQ(InputStream inputStream, int i2) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        while (i3 >= 0) {
            messageDigest.update(bArr, 0, i3);
            i3 = inputStream.read(bArr);
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Ik(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence az(File file) {
        try {
            Intrinsics.checkNotNull(file);
            return SceneKt.externalMediaSequence(SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(file, null, 1, null), false, false, false, 14, null));
        } catch (Exception unused) {
            return SequencesKt.emptySequence();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(File file) {
        if (file.isFile()) {
            Intrinsics.checkNotNull(file);
            if (Intrinsics.areEqual(FilesKt.getExtension(file), "xml")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
