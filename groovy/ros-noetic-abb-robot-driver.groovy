node {
    git url: 'https://github.com/ros-industrial/abb_robot_driver.git', branch: 'master'
    registerROS('ros:noetic-desktop-full', [
        'ros-noetic-abb-egm-msgs',
        'ros-noetic-abb-egm-rws-managers',
        'ros-noetic-abb-rapid-msgs',
        'ros-noetic-abb-rapid-sm-addin-msgs',
        'ros-noetic-abb-robot-msgs'
    ], ['ros-noetic-abb-egm-rws-managers'])
}
