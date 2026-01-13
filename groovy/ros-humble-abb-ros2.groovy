node {
    git url: "https://github.com/PickNikRobotics/abb_ros2.git", branch: "humble"
    registerROS('ros:humble-desktop-full', [
        'libpoco-dev',
        'ros-humble-abb-egm-rws-managers',
        'ros-humble-abb-ros2-msgs',
        'ros-humble-controller-manager',
        'ros-humble-hardware-interface',
        'ros-humble-joint-state-broadcaster',
        'ros-humble-joint-state-publisher',
        'ros-humble-joint-trajectory-controller',
        'ros-humble-ros-testing'
    ], [])
}
