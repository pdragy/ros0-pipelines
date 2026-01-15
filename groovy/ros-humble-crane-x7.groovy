node {
    git url: "https://github.com/rt-net/crane_x7_ros.git", branch: "humble"
    registerROS('ros:humble-desktop-full', [
        'ros-humble-hardware-interface',
        'ros-humble-moveit-ros-planning-interface',
        'ros-humble-rt-manipulators-cpp'
    ], [])
}
