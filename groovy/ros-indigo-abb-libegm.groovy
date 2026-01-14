node {
    git url: "https://github.com/ros-industrial/abb_libegm.git", branch: "master"
    registerROS('ros:indigo-ros-base', ['cmake3', 'libprotobuf-dev', 'protobuf-compiler'], [])
}
