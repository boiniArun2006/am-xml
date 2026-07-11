package lK;

import HI0.afx;
import QmE.C;
import QmE.Dsr;
import QmE.aC;
import QmE.iF;
import android.app.Activity;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SimpleDateFormat f70409n = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH);

    private static final Scene nr(String str) {
        try {
            return SceneSerializerKt.unserializeScene$default(str, false, false, false, 14, null);
        } catch (MalformedSceneException unused) {
            return null;
        }
    }

    public static final void rl(final Activity activity, final List selectedProjects, final iF eventLogger, final List scenes, final List snapshots) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        Iterator it = selectedProjects.iterator();
        while (it.hasNext()) {
            eventLogger.n(new C(2131361920, CollectionsKt.listOf(((ProjectInfo.n) it.next()).getId())));
        }
        x0X.n nVarN = w6.n(new Function0() { // from class: lK.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.t(selectedProjects, scenes, activity, snapshots, eventLogger);
            }
        });
        if (!(nVarN instanceof n.C1266n)) {
            if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<Integer> it2 = CollectionsKt.getIndices(selectedProjects).iterator();
            while (it2.hasNext()) {
                rWZ.n nVar = (rWZ.n) CollectionsKt.getOrNull(snapshots, ((IntIterator) it2).nextInt());
                if (nVar != null) {
                    eventLogger.n(new Dsr(2131361920, CollectionsKt.listOf(nVar.T())));
                }
            }
            return;
        }
        Throwable th = (Throwable) ((n.C1266n) nVarN).n();
        Iterator it3 = selectedProjects.iterator();
        while (it3.hasNext()) {
            List listListOf = CollectionsKt.listOf(((ProjectInfo.n) it3.next()).getId());
            String message = th.getMessage();
            if (message == null) {
                message = th.getLocalizedMessage();
            }
            eventLogger.n(new aC(2131361920, listListOf, new IllegalStateException(message)));
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(List list, List list2, Activity activity, List list3, iF iFVar) {
        Scene scene;
        Scene sceneNr = null;
        int i2 = 0;
        if (list.size() != 1) {
            scene = sceneNr;
        } else {
            Scene scene2 = (Scene) CollectionsKt.firstOrNull(list2);
            if (scene2 == null) {
                sceneNr = nr(FilesKt.readText$default(afx.o(activity, ((ProjectInfo.n) list.get(0)).getId()), null, 1, null));
                scene = sceneNr;
            } else {
                scene = scene2;
            }
        }
        if (scene != null) {
            String title = scene.getTitle();
            if (StringsKt.isBlank(title)) {
                title = ((ProjectInfo.n) list.get(0)).getId();
            }
            String strSerializeScene$default = SceneSerializerKt.serializeScene$default(scene, true, null, false, false, null, 60, null);
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                rWZ.n nVar = (rWZ.n) obj;
                Intrinsics.checkNotNullExpressionValue(strSerializeScene$default.getBytes(Charsets.UTF_8), "getBytes(...)");
                list3.set(i2, rWZ.n.rl(nVar, 0L, 0L, Long.valueOf(r7.length), 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -5, 31, null));
                i2 = i3;
            }
            String str = title + ".xml";
            String string = activity.getString(2132020155);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            com.alightcreative.share.j.rV9(activity, strSerializeScene$default, "text/xml", str, string, iFVar, null, null, 96, null);
        } else {
            File fileO = O(activity, list, "alight_motion_xml_" + f70409n.format(new Date()) + ".zip");
            for (Object obj2 : list3) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                list3.set(i2, rWZ.n.rl((rWZ.n) obj2, 0L, 0L, Long.valueOf(fileO.length()), 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -5, 31, null));
                i2 = i5;
            }
            String string2 = activity.getString(2132020156);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            com.alightcreative.share.j.v(activity, fileO, "application/zip", string2, iFVar, null, null, 48, null);
        }
        return Unit.INSTANCE;
    }

    private static final File O(Activity activity, List list, String str) {
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(FilesKt.resolve(FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK), "t" + System.currentTimeMillis()), str);
        if (!fileResolve.exists()) {
            File parentFile = fileResolve.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File fileO = afx.o(activity, ((ProjectInfo.n) it.next()).getId());
                        zipOutputStream.putNextEntry(new ZipEntry(fileO.getName()));
                        ByteStreamsKt.copyTo$default(new FileInputStream(fileO), zipOutputStream, 0, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(zipOutputStream, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return fileResolve;
                } finally {
                }
            } finally {
            }
        } else {
            throw new IllegalStateException("Temporary path for export file already exists.");
        }
    }
}
