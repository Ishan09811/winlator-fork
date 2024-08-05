package com.ewt45.winlator.resouces;

import com.ewt45.winlator.QH;

public class StringZh {
    public static void apply() {
        QH.string.pulse声音选项 = "PulseAudio声音服务";
        QH.string.pulse声音简介 = "pulseaudio服务用于播放声音。本服务提取自XSDL。";
        QH.string.旋转屏幕选项 = "旋转屏幕";
        QH.string.游戏样式光标选项 = "光标样式尽量使用游戏样式";
        QH.string.游戏样式光标选项说明 = "winlator继承了exagear的xserver的bug，在使用gpu渲染时鼠标光标无法正常显示，因此一般使用一个备用png图片作为鼠标光标。" +
                "\n\n若勾选此选项，会首先尝试获取游戏样式的光标，但色彩只有黑白，且动态光标只能显示为静态图片。";
        QH.string.绝对位置点击选项 = "触屏后 鼠标移动到手指位置";
        QH.string.绝对位置点击选项说明 = """
            如果勾选该选项，第一根手指按下时，光标立即移动到对应位置。其余操作逻辑均未改变。
            \n此选项可能与“锁定光标”选项冲突，建议二者不要同时开启。
            \n提示：按下第一指后，在较远位置按下第二指并移动其中一根手指，即可实现鼠标左键拖拽。
            """;
        QH.string.pulse按钮立即运行 = "立即运行";
        QH.string.pulse按钮立即停止="立即停止";
        QH.string.pulse按钮注意事项="注意事项";
        QH.string.pulse选项自动运行="启动容器后自动运行";
        QH.string.pulse注意事项文字="本功能仅供测试，不保证声音播放效果比alsa更好。" +
                "\n\n运行pulseaudio服务时，缺少的依赖库文件会被自动解压补全。" +
                "作者制作数据包的脚本中特意移除了这些库，所以不确定补全后是否会有冲突。若有冲突，请点击按钮删除这些文件。";
        QH.string.pulse删除依赖库="删除文件";
        QH.string.额外功能 = "额外功能";

        QH.string.选择数据包说明 = "未找到数据包。请从本地选择，或从Github下载，或将数据包(名称为 %s )放到 %s 文件夹中，并重启app。\n手动选择时无法查看%s文件夹。";
        QH.string.手动选择 = "手动选择";
        QH.string.从Github下载 = "从Github下载原版数据包";
        QH.string.退出 = "退出";
        QH.string.选择OBB结果 = "选择文件取消$选择文件不是数据包(%s)。请重新选择$已选择数据包(%s)，开始解压，请勿切换界面";
        QH.string.下载OBB结果 = "正在下载%s，请勿切换界面。下载进度可在手机通知栏查看$下载完成，正在解压$下载失败";
        QH.string.解压数据包 = "解压数据包";
        QH.string.Obb下载文件名 = "Winlator数据包";

        QH.string.logcat日志 = "logcat日志";
        QH.string.logcat日志说明 = "开启或关闭安卓logcat日志，用于调试。\n\n日志文件存储在 /storage/emulated/0/Download/Winlator/logcat 目录下。";
        QH.string.proot终端 = "PRoot简易终端";
        QH.string.proot终端说明 = """
            - 若开启此选项，在启动容器后，按手机返回键弹出的左侧菜单中添加一项“PRoot终端”.
            \n- 启动proot后，会运行/usr/bin/dash并连接至此进程的输入输出，实时显示。
            \n- 在终端界面底部输入要执行的命令，按下回车发送。由于并不会每次按下按键都发送字符，所以在编辑文本，发送快捷键命令等时可能无法正常工作。
            \n- 在终端界面右下角菜单中可开启“自动滚动到底部”选项。注意开启后，用户在输入命令时可能会被新的输出行打断，若出现此现象请考虑关闭该选项。
            \n- 本功能添加于6.1版本。7.0开始官方自带了日志功能，可在app主界面 - 左上角 - 设置中调整wine和box的日志输出，启动容器 - 左侧菜单中显示日志。
            """;
        QH.string.proot终端_启动失败_请关闭选项重试 = "启动失败。请关闭设置中的“PRoot终端”选项再重试。";
        QH.string.proot终端_请先开启选项 = "无法获取输出。请退回到主界面，左上角进入设置，开启PRoot终端选项。";
        QH.string.proot终端_自动滚动到底部 = "自动滚动到底部";
        QH.string.画中画模式 = "画中画模式";
        QH.string.获取管理全部文件权限 = "获取管理全部文件权限";
        QH.string.获取管理全部文件权限说明 = """
            申请管理所有文件的权限 android.permission.MANAGE_EXTERNAL_STORAGE。
            \n拥有此权限后，可以将外部存储设备 例如otg连接的移动硬盘 添加作为容器的驱动器（可能需要手动填入路径）。
            \n方法来自 coffincolors(discord) 和 agnostic-apollo(termux)
            """;
    }
}
