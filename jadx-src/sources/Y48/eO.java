package Y48;

import android.app.Activity;
import android.content.Intent;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.export.preview.ExportPreviewActivity;
import com.safedk.android.utils.Logger;
import d8q.jqQ.QTafcm;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class eO {
    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static final void n(Activity activity, File data, File file, boolean z2, int i2, String str, String chooseDialogTitle, SceneType projectType, String projectId, ExportParams params, int i3, rWZ.n nVar, rWZ.n nVar2, String str2, String str3, File file2, File file3) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(str, QTafcm.XrtnQBGIhYJXr);
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intent intent = new Intent(activity, (Class<?>) ExportPreviewActivity.class);
        intent.putExtra("DATA_FILE", data);
        intent.putExtra("SAVETOSTORAGETARGET", file);
        intent.putExtra("SAVE_COMPLETE_MSG", i2);
        intent.putExtra("INDEX_MEDIA", z2);
        intent.putExtra("MIMETYPE", str);
        intent.putExtra("CHOOSE_DLG_TITLE", chooseDialogTitle);
        intent.putExtra("EXPORT_WIDTH", params.getWidth());
        intent.putExtra("EXPORT_HEIGHT", params.getHeight());
        intent.putExtra("EXPORT_FORMAT", params.getFormat());
        intent.putExtra("SCENE_TOTAL_TIME", i3);
        intent.putExtra("P_TYPE", projectType);
        intent.putExtra("P_ID", projectId);
        intent.putExtra("EXPORT_SNAPSHOT", nVar != null ? rWZ.w6.n(nVar) : null);
        intent.putExtra("TEMPLATE_TOGGLE_EXPORT_SNAPSHOT", nVar2 != null ? rWZ.w6.n(nVar2) : null);
        intent.putExtra("TEMPLATE_LINK", str2);
        intent.putExtra("TEMPLATE_TITLE", str3);
        intent.putExtra("TEMPLATE_LINK_DATA", file2);
        intent.putExtra("TEMPLATE_QR_DATA", file3);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    public static /* synthetic */ void rl(Activity activity, File file, File file2, boolean z2, int i2, String str, String str2, SceneType sceneType, String str3, ExportParams exportParams, int i3, rWZ.n nVar, rWZ.n nVar2, String str4, String str5, File file3, File file4, int i5, Object obj) {
        File file5;
        Activity activity2;
        File file6;
        File file7;
        int i7;
        String str6;
        String str7;
        SceneType sceneType2;
        String str8;
        ExportParams exportParams2;
        int i8;
        rWZ.n nVar3;
        boolean z3 = (i5 & 4) != 0 ? false : z2;
        rWZ.n nVar4 = (i5 & 2048) != 0 ? null : nVar2;
        String str9 = (i5 & 4096) != 0 ? null : str4;
        String str10 = (i5 & 8192) != 0 ? null : str5;
        File file8 = (i5 & 16384) != 0 ? null : file3;
        if ((i5 & 32768) != 0) {
            file5 = null;
            file6 = file;
            file7 = file2;
            i7 = i2;
            str6 = str;
            str7 = str2;
            sceneType2 = sceneType;
            str8 = str3;
            exportParams2 = exportParams;
            i8 = i3;
            nVar3 = nVar;
            activity2 = activity;
        } else {
            file5 = file4;
            activity2 = activity;
            file6 = file;
            file7 = file2;
            i7 = i2;
            str6 = str;
            str7 = str2;
            sceneType2 = sceneType;
            str8 = str3;
            exportParams2 = exportParams;
            i8 = i3;
            nVar3 = nVar;
        }
        n(activity2, file6, file7, z3, i7, str6, str7, sceneType2, str8, exportParams2, i8, nVar3, nVar4, str9, str10, file8, file5);
    }
}
