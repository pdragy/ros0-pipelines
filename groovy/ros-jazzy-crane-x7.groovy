node {
    git url: "https://github.com/rt-net/crane_x7_ros.git", branch: "jazzy"
    registerROS('ros:jazzy-desktop-full', [
        'ros-jazzy-hardware-interface',
        'ros-jazzy-moveit-ros-planning-interface',
        'ros-jazzy-rt-manipulators-cpp'
    ], [])
}
