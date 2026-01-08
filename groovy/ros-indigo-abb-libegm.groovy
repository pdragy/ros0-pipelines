node {
    git url: "https://github.com/ros-industrial/abb_libegm.git", branch: "master"
    registerROS('ros:indigo-desktop-full', ['cmake3', 'protobuf-compiler'], [])
}
