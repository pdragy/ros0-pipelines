node {
    git url: "https://github.com/iirob/ros_opcua_communication.git", branch: "kinetic-devel"
    sh "git submodule update --init --recursive"
    registerROS('osrf/ros:melodic-desktop-full', [], [])
}
