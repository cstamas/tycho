import java.io.File;

org.eclipse.tycho.extras.buildtimestamp.jgit.test.UnzipFile.unzip(new File(basedir, "dirtySubmodules.zip"), basedir);

// this will cause the build to fail due to dirty working tree
new File(basedir,"feature/untracked_file.txt").write("test")

return true;